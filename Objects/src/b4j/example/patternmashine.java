package b4j.example;


import anywheresoftware.b4a.BA;

public class patternmashine extends Object{
public static patternmashine mostCurrent = new patternmashine();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.patternmashine", null);
		ba.loadHtSubs(patternmashine.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.patternmashine", ba);
		}
	}
    public static Class<?> getObject() {
		return patternmashine.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strplattformexperience = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strplattformlogin = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strplattformname = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strplattformtarget = null;
public static anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _hashlib = null;
public static b4j.example.main _main = null;
public static b4j.example.helpdialog _helpdialog = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _btnplattformadd_click() throws Exception{
String _basepattern = "";
String _targetpattern = "";
anywheresoftware.b4a.objects.collections.Map _savefile = null;
String _message = "";
String _directory = "";
String _dirparent = "";
 //BA.debugLineNum = 79;BA.debugLine="Private Sub btnPlattformAdd_Click";
 //BA.debugLineNum = 80;BA.debugLine="Private BasePattern As String";
_basepattern = "";
 //BA.debugLineNum = 81;BA.debugLine="Private TargetPattern As String";
_targetpattern = "";
 //BA.debugLineNum = 82;BA.debugLine="Private SaveFile As Map";
_savefile = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 83;BA.debugLine="Private Message = \"\" As String";
_message = "";
 //BA.debugLineNum = 85;BA.debugLine="If strPlattformName.Text.Trim = \"\" Then";
if ((_strplattformname.getText().trim()).equals("")) { 
 //BA.debugLineNum = 86;BA.debugLine="Message = Message & \"Bitte Plattfrom-Namen eintr";
_message = _message+"Bitte Plattfrom-Namen eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
 //BA.debugLineNum = 88;BA.debugLine="If strPlattformTarget.Text.Trim = \"\" Then";
if ((_strplattformtarget.getText().trim()).equals("")) { 
 //BA.debugLineNum = 89;BA.debugLine="Message = Message & \"Bitte Plattfrom-Zweck eintr";
_message = _message+"Bitte Plattfrom-Zweck eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
 //BA.debugLineNum = 91;BA.debugLine="If strPlattformLogin.Text.Trim = \"\" Then";
if ((_strplattformlogin.getText().trim()).equals("")) { 
 //BA.debugLineNum = 92;BA.debugLine="Message = Message & \"Bitte Plattfrom-Login eintr";
_message = _message+"Bitte Plattfrom-Login eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
 //BA.debugLineNum = 94;BA.debugLine="If strPlattformExperience.Text.Trim = \"\" Then";
if ((_strplattformexperience.getText().trim()).equals("")) { 
 //BA.debugLineNum = 95;BA.debugLine="Message = Message & \"Bitte Plattfrom-Erfahrung e";
_message = _message+"Bitte Plattfrom-Erfahrung eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
 //BA.debugLineNum = 98;BA.debugLine="If Message <> \"\" Then";
if ((_message).equals("") == false) { 
 //BA.debugLineNum = 99;BA.debugLine="XUI.MsgboxAsync(Message, \"Hinweis\")";
_xui.MsgboxAsync(ba,_message,"Hinweis");
 //BA.debugLineNum = 100;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 103;BA.debugLine="BasePattern = \"AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHII";
_basepattern = "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ";
 //BA.debugLineNum = 104;BA.debugLine="BasePattern = BasePattern & \"aaaabbbbccccddddeeee";
_basepattern = _basepattern+"aaaabbbbccccddddeeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxxxyyyyzzzz";
 //BA.debugLineNum = 105;BA.debugLine="BasePattern = BasePattern & \"00001111222233334444";
_basepattern = _basepattern+"0000111122223333444455556666777788889999--__::;;..,,!!$$%%&&??";
 //BA.debugLineNum = 107;BA.debugLine="TargetPattern = GeneratePattern(BasePattern, Gene";
_targetpattern = _generatepattern(_basepattern,_generateseed(_strplattformname.getText().trim()));
 //BA.debugLineNum = 108;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformtarget.getText().trim()));
 //BA.debugLineNum = 109;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformlogin.getText().trim()));
 //BA.debugLineNum = 110;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformexperience.getText().trim()));
 //BA.debugLineNum = 112;BA.debugLine="SaveFile.Initialize";
_savefile.Initialize();
 //BA.debugLineNum = 113;BA.debugLine="SaveFile.Put(\"Plattform\", strPlattformName.Text.T";
_savefile.Put((Object)("Plattform"),(Object)(_strplattformname.getText().trim()));
 //BA.debugLineNum = 114;BA.debugLine="SaveFile.Put(\"Pattern\", TargetPattern)";
_savefile.Put((Object)("Pattern"),(Object)(_targetpattern));
 //BA.debugLineNum = 116;BA.debugLine="Private Directory As String";
_directory = "";
 //BA.debugLineNum = 117;BA.debugLine="Private DirParent As String";
_dirparent = "";
 //BA.debugLineNum = 119;BA.debugLine="Directory = PlattformDir";
_directory = _plattformdir();
 //BA.debugLineNum = 120;BA.debugLine="DirParent = PlattformDirParent";
_dirparent = _plattformdirparent();
 //BA.debugLineNum = 122;BA.debugLine="If File.Exists(Directory,\"\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_directory,"")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 123;BA.debugLine="File.MakeDir(DirParent,\"PassCon\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_dirparent,"PassCon");
 };
 //BA.debugLineNum = 126;BA.debugLine="File.WriteMap(Directory, ClearFilename(strPlattfo";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_directory,_clearfilename(_strplattformname.getText().trim())+".plat",_savefile);
 //BA.debugLineNum = 127;BA.debugLine="frm.Close()";
_frm.Close();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public static String  _clearfilename(String _filename) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub ClearFilename(FileName As String) As S";
 //BA.debugLineNum = 73;BA.debugLine="FileName = Regex.Replace(\"[\\ \\.]\", FileName, \"_\")";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[\\ \\.]",_filename,"_");
 //BA.debugLineNum = 74;BA.debugLine="FileName = Regex.Replace(\"[^a-zA-Z0-9_-]\", FileNa";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[^a-zA-Z0-9_-]",_filename,"");
 //BA.debugLineNum = 75;BA.debugLine="Return FileName";
if (true) return _filename;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _generatepattern(String _basepatternstring,byte[] _seed) throws Exception{
anywheresoftware.b4a.objects.collections.List _unsignednumbers = null;
byte _value = (byte)0;
anywheresoftware.b4a.objects.collections.List _basechars = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _usepattern = null;
int _patterncount = 0;
int _bytecount = 0;
int _internalcount = 0;
int _tempnumber = 0;
int _cnt = 0;
 //BA.debugLineNum = 29;BA.debugLine="Private Sub GeneratePattern(BasePatternString As S";
 //BA.debugLineNum = 31;BA.debugLine="Private unsignedNumbers As List";
_unsignednumbers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 32;BA.debugLine="unsignedNumbers.Initialize";
_unsignednumbers.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="For Each value As Byte In Seed";
{
final byte[] group3 = _seed;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_value = group3[index3];
 //BA.debugLineNum = 35;BA.debugLine="unsignedNumbers.Add(ToUnsigned(value))";
_unsignednumbers.Add((Object)(_tounsigned(_value)));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Private BaseChars As List";
_basechars = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 40;BA.debugLine="BaseChars.Initialize";
_basechars.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="BaseChars.AddAll(Regex.Split(\"\",BasePatternString";
_basechars.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("",_basepatternstring)));
 //BA.debugLineNum = 44;BA.debugLine="Private UsePattern As StringBuilder";
_usepattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private PatternCount = BaseChars.Size - 1 As Int";
_patterncount = (int) (_basechars.getSize()-1);
 //BA.debugLineNum = 46;BA.debugLine="Private ByteCount = unsignedNumbers.Size - 1 As I";
_bytecount = (int) (_unsignednumbers.getSize()-1);
 //BA.debugLineNum = 47;BA.debugLine="Private InternalCount = 0 As Int";
_internalcount = (int) (0);
 //BA.debugLineNum = 48;BA.debugLine="Private TempNumber As Int";
_tempnumber = 0;
 //BA.debugLineNum = 50;BA.debugLine="UsePattern.Initialize";
_usepattern.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="For cnt = 0 To PatternCount";
{
final int step15 = 1;
final int limit15 = _patterncount;
_cnt = (int) (0) ;
for (;_cnt <= limit15 ;_cnt = _cnt + step15 ) {
 //BA.debugLineNum = 53;BA.debugLine="TempNumber = unsignedNumbers.Get(InternalCount)";
_tempnumber = (int) ((double)(BA.ObjectToNumber(_unsignednumbers.Get(_internalcount)))%(_basechars.getSize()-1));
 //BA.debugLineNum = 54;BA.debugLine="UsePattern.Append(BaseChars.Get(TempNumber))";
_usepattern.Append(BA.ObjectToString(_basechars.Get(_tempnumber)));
 //BA.debugLineNum = 55;BA.debugLine="BaseChars.RemoveAt(TempNumber)";
_basechars.RemoveAt(_tempnumber);
 //BA.debugLineNum = 56;BA.debugLine="If InternalCount < ByteCount Then";
if (_internalcount<_bytecount) { 
 //BA.debugLineNum = 57;BA.debugLine="InternalCount = InternalCount + 1";
_internalcount = (int) (_internalcount+1);
 }else {
 //BA.debugLineNum = 59;BA.debugLine="InternalCount = 0";
_internalcount = (int) (0);
 };
 }
};
 //BA.debugLineNum = 62;BA.debugLine="Return UsePattern";
if (true) return BA.ObjectToString(_usepattern);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static byte[]  _generateseed(String _datastring) throws Exception{
byte[] _seedhash = null;
 //BA.debugLineNum = 65;BA.debugLine="Private Sub GenerateSeed(DataString As String) As";
 //BA.debugLineNum = 66;BA.debugLine="Private SeedHash() As Byte";
_seedhash = new byte[(int) (0)];
;
 //BA.debugLineNum = 67;BA.debugLine="SeedHash = HashLib.GetMessageDigest(DataString.Ge";
_seedhash = _hashlib.GetMessageDigest(_datastring.getBytes("UTF8"),"SHA-512");
 //BA.debugLineNum = 68;BA.debugLine="Return SeedHash";
if (true) return _seedhash;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public static String  _plattformdir() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Public Sub PlattformDir() As String";
 //BA.debugLineNum = 132;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
 //BA.debugLineNum = 133;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\PassCon\\";
 }else {
 //BA.debugLineNum = 135;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/PassCon/";
 };
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _plattformdirparent() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub PlattformDirParent() As String";
 //BA.debugLineNum = 141;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
 //BA.debugLineNum = 142;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\";
 }else {
 //BA.debugLineNum = 144;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/";
 };
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private strPlattformExperience As TextField";
_strplattformexperience = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private strPlattformLogin As TextField";
_strplattformlogin = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private strPlattformName As TextField";
_strplattformname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private strPlattformTarget As TextField";
_strplattformtarget = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private HashLib As MessageDigest";
_hashlib = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _show() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 15;BA.debugLine="If frm.IsInitialized = False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 16;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
_frm.Initialize(ba,"frm",-1,-1);
 //BA.debugLineNum = 17;BA.debugLine="frm.RootPane.LoadLayout(\"PlattformView\")";
_frm.getRootPane().LoadLayout(ba,"PlattformView");
 //BA.debugLineNum = 18;BA.debugLine="frm.Resizable = False";
_frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 19;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 };
 //BA.debugLineNum = 21;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static int  _tounsigned(byte _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub ToUnsigned(b As Byte) As Int";
 //BA.debugLineNum = 26;BA.debugLine="Return Bit.And(0xFF, b)";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_b));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return 0;
}
}
