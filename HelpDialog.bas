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
End Sub

Public Sub OpenHelp
	If frm.IsInitialized = False Then
		frm.Initialize("frm",-1, -1)
		frm.RootPane.LoadLayout("HelpWindow")
		frm.Resizable = False
		frm.SetFormStyle("UTILITY")
	End If
	frm.ShowAndWait
End Sub
