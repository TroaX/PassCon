package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class patternmashine extends Object{
public static patternmashine mostCurrent = new patternmashine();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.patternmashine", null);
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
public static String  _show() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If frm.IsInitialized = False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
_frm.Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="frm.RootPane.LoadLayout(\"PlattformView\")";
_frm.getRootPane().LoadLayout(ba,"PlattformView");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="frm.Resizable = False";
_frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 };
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="End Sub";
return "";
}
public static int  _tounsigned(byte _b) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "tounsigned", false))
	 {return ((Integer) Debug.delegate(ba, "tounsigned", new Object[] {_b}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub ToUnsigned(b As Byte) As Int";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Return Bit.And(0xFF, b)";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_b));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return 0;
}
public static String  _plattformdir() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "plattformdir", false))
	 {return ((String) Debug.delegate(ba, "plattformdir", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub PlattformDir() As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\PassCon\\";
 }else {
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/PassCon/";
 };
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="End Sub";
return "";
}
public static String  _btnplattformadd_click() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "btnplattformadd_click", false))
	 {return ((String) Debug.delegate(ba, "btnplattformadd_click", null));}
String _basepattern = "";
String _targetpattern = "";
anywheresoftware.b4a.objects.collections.Map _savefile = null;
String _message = "";
String _directory = "";
String _dirparent = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub btnPlattformAdd_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Private BasePattern As String";
_basepattern = "";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private TargetPattern As String";
_targetpattern = "";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private SaveFile As Map";
_savefile = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private Message = \"\" As String";
_message = "";
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="If strPlattformName.Text.Trim = \"\" Then";
if ((_strplattformname.getText().trim()).equals("")) { 
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Message = Message & \"Bitte Plattfrom-Namen eintr";
_message = _message+"Bitte Plattfrom-Namen eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="If strPlattformTarget.Text.Trim = \"\" Then";
if ((_strplattformtarget.getText().trim()).equals("")) { 
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Message = Message & \"Bitte Plattfrom-Zweck eintr";
_message = _message+"Bitte Plattfrom-Zweck eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="If strPlattformLogin.Text.Trim = \"\" Then";
if ((_strplattformlogin.getText().trim()).equals("")) { 
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Message = Message & \"Bitte Plattfrom-Login eintr";
_message = _message+"Bitte Plattfrom-Login eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="If strPlattformExperience.Text.Trim = \"\" Then";
if ((_strplattformexperience.getText().trim()).equals("")) { 
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Message = Message & \"Bitte Plattfrom-Erfahrung e";
_message = _message+"Bitte Plattfrom-Erfahrung eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="If Message <> \"\" Then";
if ((_message).equals("") == false) { 
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="XUI.MsgboxAsync(Message, \"Hinweis\")";
_xui.MsgboxAsync(ba,_message,"Hinweis");
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="BasePattern = \"AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHII";
_basepattern = "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ";
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="BasePattern = BasePattern & \"aaaabbbbccccddddeeee";
_basepattern = _basepattern+"aaaabbbbccccddddeeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxxxyyyyzzzz";
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="BasePattern = BasePattern & \"00001111222233334444";
_basepattern = _basepattern+"0000111122223333444455556666777788889999--__::;;..,,!!$$%%&&??";
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="TargetPattern = GeneratePattern(BasePattern, Gene";
_targetpattern = _generatepattern(_basepattern,_generateseed(_strplattformname.getText().trim()));
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformtarget.getText().trim()));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformlogin.getText().trim()));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformexperience.getText().trim()));
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="SaveFile.Initialize";
_savefile.Initialize();
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="SaveFile.Put(\"Plattform\", strPlattformName.Text.T";
_savefile.Put((Object)("Plattform"),(Object)(_strplattformname.getText().trim()));
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="SaveFile.Put(\"Pattern\", TargetPattern)";
_savefile.Put((Object)("Pattern"),(Object)(_targetpattern));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="Private Directory As String";
_directory = "";
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="Private DirParent As String";
_dirparent = "";
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="Directory = PlattformDir";
_directory = _plattformdir();
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="DirParent = PlattformDirParent";
_dirparent = _plattformdirparent();
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="If File.Exists(Directory,\"\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_directory,"")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="File.MakeDir(DirParent,\"PassCon\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_dirparent,"PassCon");
 };
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="File.WriteMap(Directory, ClearFilename(strPlattfo";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_directory,_clearfilename(_strplattformname.getText().trim())+".plat",_savefile);
RDebugUtils.currentLine=983088;
 //BA.debugLineNum = 983088;BA.debugLine="frm.Close()";
_frm.Close();
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="End Sub";
return "";
}
public static String  _generatepattern(String _basepatternstring,byte[] _seed) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "generatepattern", false))
	 {return ((String) Debug.delegate(ba, "generatepattern", new Object[] {_basepatternstring,_seed}));}
anywheresoftware.b4a.objects.collections.List _unsignednumbers = null;
byte _value = (byte)0;
anywheresoftware.b4a.objects.collections.List _basechars = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _usepattern = null;
int _patterncount = 0;
int _bytecount = 0;
int _internalcount = 0;
int _tempnumber = 0;
int _cnt = 0;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub GeneratePattern(BasePatternString As S";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private unsignedNumbers As List";
_unsignednumbers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="unsignedNumbers.Initialize";
_unsignednumbers.Initialize();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="For Each value As Byte In Seed";
{
final byte[] group3 = _seed;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_value = group3[index3];
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="unsignedNumbers.Add(ToUnsigned(value))";
_unsignednumbers.Add((Object)(_tounsigned(_value)));
 }
};
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Private BaseChars As List";
_basechars = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="BaseChars.Initialize";
_basechars.Initialize();
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="BaseChars.AddAll(Regex.Split(\"\",BasePatternString";
_basechars.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("",_basepatternstring)));
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Private UsePattern As StringBuilder";
_usepattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Private PatternCount = BaseChars.Size - 1 As Int";
_patterncount = (int) (_basechars.getSize()-1);
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Private ByteCount = unsignedNumbers.Size - 1 As I";
_bytecount = (int) (_unsignednumbers.getSize()-1);
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Private InternalCount = 0 As Int";
_internalcount = (int) (0);
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Private TempNumber As Int";
_tempnumber = 0;
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="UsePattern.Initialize";
_usepattern.Initialize();
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="For cnt = 0 To PatternCount";
{
final int step15 = 1;
final int limit15 = _patterncount;
_cnt = (int) (0) ;
for (;_cnt <= limit15 ;_cnt = _cnt + step15 ) {
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="TempNumber = unsignedNumbers.Get(InternalCount)";
_tempnumber = (int) ((double)(BA.ObjectToNumber(_unsignednumbers.Get(_internalcount)))%(_basechars.getSize()-1));
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="UsePattern.Append(BaseChars.Get(TempNumber))";
_usepattern.Append(BA.ObjectToString(_basechars.Get(_tempnumber)));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="BaseChars.RemoveAt(TempNumber)";
_basechars.RemoveAt(_tempnumber);
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="If InternalCount < ByteCount Then";
if (_internalcount<_bytecount) { 
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="InternalCount = InternalCount + 1";
_internalcount = (int) (_internalcount+1);
 }else {
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="InternalCount = 0";
_internalcount = (int) (0);
 };
 }
};
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="Return UsePattern";
if (true) return BA.ObjectToString(_usepattern);
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="End Sub";
return "";
}
public static byte[]  _generateseed(String _datastring) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "generateseed", false))
	 {return ((byte[]) Debug.delegate(ba, "generateseed", new Object[] {_datastring}));}
byte[] _seedhash = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub GenerateSeed(DataString As String) As";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private SeedHash() As Byte";
_seedhash = new byte[(int) (0)];
;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="SeedHash = HashLib.GetMessageDigest(DataString.Ge";
_seedhash = _hashlib.GetMessageDigest(_datastring.getBytes("UTF8"),"SHA-512");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Return SeedHash";
if (true) return _seedhash;
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return null;
}
public static String  _plattformdirparent() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "plattformdirparent", false))
	 {return ((String) Debug.delegate(ba, "plattformdirparent", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub PlattformDirParent() As String";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\";
 }else {
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/";
 };
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="End Sub";
return "";
}
public static String  _clearfilename(String _filename) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "clearfilename", false))
	 {return ((String) Debug.delegate(ba, "clearfilename", new Object[] {_filename}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub ClearFilename(FileName As String) As S";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="FileName = Regex.Replace(\"[\\ \\.]\", FileName, \"_\")";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[\\ \\.]",_filename,"_");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="FileName = Regex.Replace(\"[^a-zA-Z0-9_-]\", FileNa";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[^a-zA-Z0-9_-]",_filename,"");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Return FileName";
if (true) return _filename;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return "";
}
}