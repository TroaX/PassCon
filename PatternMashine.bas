B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private frm As Form
	Private XUI As XUI
	Private strPlattformExperience As TextField
	Private strPlattformLogin As TextField
	Private strPlattformName As TextField
	Private strPlattformTarget As TextField
	Private HashLib As MessageDigest
End Sub

' Show the Add Dialog for Plattforms
Public Sub Show
	If frm.IsInitialized = False Then
		frm.Initialize("frm",-1, -1)
		frm.RootPane.LoadLayout("PlattformView")
		frm.Resizable = False
		frm.SetFormStyle("UTILITY")
	End If
	frm.ShowAndWait
End Sub

' Makes a signed Byte to a unsigned Int
Public Sub ToUnsigned(b As Byte) As Int
	Return Bit.And(0xFF, b)
End Sub

Private Sub GeneratePattern(BasePatternString As String, Seed() As Byte) As String
	' Convert signed Seedbytes to unsigned Seed Bytes
	Private unsignedNumbers As List
	unsignedNumbers.Initialize
	
	For Each value As Byte In Seed
		unsignedNumbers.Add(ToUnsigned(value))
	Next
	
	' Splitting the BasePatternString to a String-List
	Private BaseChars As List
	BaseChars.Initialize
	BaseChars.AddAll(Regex.Split("",BasePatternString))
	
	' Generate a new Pattern with a Charsort based an the Hash as Seed
	Private UsePattern As StringBuilder
	Private PatternCount = BaseChars.Size - 1 As Int
	Private ByteCount = unsignedNumbers.Size - 1 As Int
	Private InternalCount = 0 As Int
	Private TempNumber As Int
	
	UsePattern.Initialize
	
	For cnt = 0 To PatternCount
		TempNumber = unsignedNumbers.Get(InternalCount) Mod (BaseChars.Size - 1)
		UsePattern.Append(BaseChars.Get(TempNumber))
		BaseChars.RemoveAt(TempNumber)
		If InternalCount < ByteCount Then
			InternalCount = InternalCount + 1
		Else
			InternalCount = 0
		End If
	Next
	Return UsePattern
End Sub

Private Sub GenerateSeed(DataString As String) As Byte()
	Private SeedHash() As Byte
	SeedHash = HashLib.GetMessageDigest(DataString.GetBytes("UTF8"), "SHA-512")
	Return SeedHash
End Sub

' Clear the Plattform-Name to use as File-Name
Private Sub ClearFilename(FileName As String) As String
	FileName = Regex.Replace("[\ \.]", FileName, "_")
	FileName = Regex.Replace("[^a-zA-Z0-9_-]", FileName, "")
	Return FileName
End Sub

' Create Plattform and Generate the Pattern
Private Sub btnPlattformAdd_Click
	Private BasePattern As String
	Private TargetPattern As String
	Private SaveFile As Map
	Private Message = "" As String	
	
	If strPlattformName.Text.Trim = "" Then
		Message = Message & "Bitte Plattfrom-Namen eintragen" & CRLF
	End If
	If strPlattformTarget.Text.Trim = "" Then
		Message = Message & "Bitte Plattfrom-Zweck eintragen" & CRLF
	End If
	If strPlattformLogin.Text.Trim = "" Then
		Message = Message & "Bitte Plattfrom-Login eintragen" & CRLF
	End If
	If strPlattformExperience.Text.Trim = "" Then
		Message = Message & "Bitte Plattfrom-Erfahrung eintragen" & CRLF
	End If
	
	If Message <> "" Then
		XUI.MsgboxAsync(Message, "Hinweis")
		Return
	End If
	
	BasePattern = "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ"
	BasePattern = BasePattern & "aaaabbbbccccddddeeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxxxyyyyzzzz"
	BasePattern = BasePattern & "0000111122223333444455556666777788889999--__::;;..,,!!$$%%&&??"
	
	TargetPattern = GeneratePattern(BasePattern, GenerateSeed(strPlattformName.Text.Trim))
	TargetPattern = GeneratePattern(TargetPattern, GenerateSeed(strPlattformTarget.Text.Trim))
	TargetPattern = GeneratePattern(TargetPattern, GenerateSeed(strPlattformLogin.Text.Trim))
	TargetPattern = GeneratePattern(TargetPattern, GenerateSeed(strPlattformExperience.Text.Trim))
	
	SaveFile.Initialize
	SaveFile.Put("Plattform", strPlattformName.Text.Trim)
	SaveFile.Put("Pattern", TargetPattern)
	
	Private Directory As String
	Private DirParent As String
	
	Directory = PlattformDir
	DirParent = PlattformDirParent
	
	If File.Exists(Directory,"") = False Then
		File.MakeDir(DirParent,"PassCon")
	End If
	
	File.WriteMap(Directory, ClearFilename(strPlattformName.Text.Trim) & ".plat", SaveFile)
	frm.Close()
End Sub

' Generate OS Specific Home Dir for the Plattform Files
Public Sub PlattformDir() As String
	If GetSystemProperty("os.name","") = "win" Then
		Return GetSystemProperty("user.home","") & "\Documents\PassCon\"
	Else
		Return GetSystemProperty("user.home","") & "/Documents/PassCon/"
	End If
End Sub

' Generate OS Specific Home Dir Parent for the Plattform Files
Public Sub PlattformDirParent() As String
	If GetSystemProperty("os.name","") = "win" Then
		Return GetSystemProperty("user.home","") & "\Documents\"
	Else
		Return GetSystemProperty("user.home","") & "/Documents/"
	End If
End Sub