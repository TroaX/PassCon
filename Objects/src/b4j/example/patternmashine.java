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
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If frm.IsInitialized = False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
_frm.Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="frm.RootPane.LoadLayout(\"PlattformView\")";
_frm.getRootPane().LoadLayout(ba,"PlattformView");
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="frm.Resizable = False";
_frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 };
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="End Sub";
return "";
}
public static int  _tounsigned(byte _b) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "tounsigned", false))
	 {return ((Integer) Debug.delegate(ba, "tounsigned", new Object[] {_b}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub ToUnsigned(b As Byte) As Int";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Return Bit.And(0xFF, b)";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_b));
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return 0;
}
public static String  _plattformdir() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "plattformdir", false))
	 {return ((String) Debug.delegate(ba, "plattformdir", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub PlattformDir() As String";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\PassCon\\";
 }else {
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/PassCon/";
 };
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub btnPlattformAdd_Click";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Private BasePattern As String";
_basepattern = "";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Private TargetPattern As String";
_targetpattern = "";
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Private SaveFile As Map";
_savefile = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Private Message = \"\" As String";
_message = "";
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="If strPlattformName.Text.Trim = \"\" Then";
if ((_strplattformname.getText().trim()).equals("")) { 
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Message = Message & \"Bitte Plattfrom-Namen eintr";
_message = _message+"Bitte Plattfrom-Namen eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="If strPlattformTarget.Text.Trim = \"\" Then";
if ((_strplattformtarget.getText().trim()).equals("")) { 
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Message = Message & \"Bitte Plattfrom-Zweck eintr";
_message = _message+"Bitte Plattfrom-Zweck eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="If strPlattformLogin.Text.Trim = \"\" Then";
if ((_strplattformlogin.getText().trim()).equals("")) { 
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Message = Message & \"Bitte Plattfrom-Login eintr";
_message = _message+"Bitte Plattfrom-Login eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="If strPlattformExperience.Text.Trim = \"\" Then";
if ((_strplattformexperience.getText().trim()).equals("")) { 
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Message = Message & \"Bitte Plattfrom-Erfahrung e";
_message = _message+"Bitte Plattfrom-Erfahrung eintragen"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="If Message <> \"\" Then";
if ((_message).equals("") == false) { 
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="XUI.MsgboxAsync(Message, \"Hinweis\")";
_xui.MsgboxAsync(ba,_message,"Hinweis");
RDebugUtils.currentLine=4259861;
 //BA.debugLineNum = 4259861;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4259864;
 //BA.debugLineNum = 4259864;BA.debugLine="BasePattern = \"AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHII";
_basepattern = "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ";
RDebugUtils.currentLine=4259865;
 //BA.debugLineNum = 4259865;BA.debugLine="BasePattern = BasePattern & \"aaaabbbbccccddddeeee";
_basepattern = _basepattern+"aaaabbbbccccddddeeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxxxyyyyzzzz";
RDebugUtils.currentLine=4259866;
 //BA.debugLineNum = 4259866;BA.debugLine="BasePattern = BasePattern & \"00001111222233334444";
_basepattern = _basepattern+"0000111122223333444455556666777788889999--__::;;..,,!!$$%%&&??";
RDebugUtils.currentLine=4259868;
 //BA.debugLineNum = 4259868;BA.debugLine="TargetPattern = GeneratePattern(BasePattern, Gene";
_targetpattern = _generatepattern(_basepattern,_generateseed(_strplattformname.getText().trim()));
RDebugUtils.currentLine=4259869;
 //BA.debugLineNum = 4259869;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformtarget.getText().trim()));
RDebugUtils.currentLine=4259870;
 //BA.debugLineNum = 4259870;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformlogin.getText().trim()));
RDebugUtils.currentLine=4259871;
 //BA.debugLineNum = 4259871;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
_targetpattern = _generatepattern(_targetpattern,_generateseed(_strplattformexperience.getText().trim()));
RDebugUtils.currentLine=4259873;
 //BA.debugLineNum = 4259873;BA.debugLine="SaveFile.Initialize";
_savefile.Initialize();
RDebugUtils.currentLine=4259874;
 //BA.debugLineNum = 4259874;BA.debugLine="SaveFile.Put(\"Plattform\", strPlattformName.Text.T";
_savefile.Put((Object)("Plattform"),(Object)(_strplattformname.getText().trim()));
RDebugUtils.currentLine=4259875;
 //BA.debugLineNum = 4259875;BA.debugLine="SaveFile.Put(\"Pattern\", TargetPattern)";
_savefile.Put((Object)("Pattern"),(Object)(_targetpattern));
RDebugUtils.currentLine=4259877;
 //BA.debugLineNum = 4259877;BA.debugLine="Private Directory As String";
_directory = "";
RDebugUtils.currentLine=4259878;
 //BA.debugLineNum = 4259878;BA.debugLine="Private DirParent As String";
_dirparent = "";
RDebugUtils.currentLine=4259880;
 //BA.debugLineNum = 4259880;BA.debugLine="Directory = PlattformDir";
_directory = _plattformdir();
RDebugUtils.currentLine=4259881;
 //BA.debugLineNum = 4259881;BA.debugLine="DirParent = PlattformDirParent";
_dirparent = _plattformdirparent();
RDebugUtils.currentLine=4259883;
 //BA.debugLineNum = 4259883;BA.debugLine="If File.Exists(Directory,\"\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_directory,"")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4259884;
 //BA.debugLineNum = 4259884;BA.debugLine="File.MakeDir(DirParent,\"PassCon\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_dirparent,"PassCon");
 };
RDebugUtils.currentLine=4259887;
 //BA.debugLineNum = 4259887;BA.debugLine="File.WriteMap(Directory, ClearFilename(strPlattfo";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_directory,_clearfilename(_strplattformname.getText().trim())+".plat",_savefile);
RDebugUtils.currentLine=4259888;
 //BA.debugLineNum = 4259888;BA.debugLine="frm.Close()";
_frm.Close();
RDebugUtils.currentLine=4259889;
 //BA.debugLineNum = 4259889;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub GeneratePattern(BasePatternString As S";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Private unsignedNumbers As List";
_unsignednumbers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="unsignedNumbers.Initialize";
_unsignednumbers.Initialize();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="For Each value As Byte In Seed";
{
final byte[] group3 = _seed;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_value = group3[index3];
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="unsignedNumbers.Add(ToUnsigned(value))";
_unsignednumbers.Add((Object)(_tounsigned(_value)));
 }
};
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="Private BaseChars As List";
_basechars = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="BaseChars.Initialize";
_basechars.Initialize();
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="BaseChars.AddAll(Regex.Split(\"\",BasePatternString";
_basechars.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("",_basepatternstring)));
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Private UsePattern As StringBuilder";
_usepattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Private PatternCount = BaseChars.Size - 1 As Int";
_patterncount = (int) (_basechars.getSize()-1);
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="Private ByteCount = unsignedNumbers.Size - 1 As I";
_bytecount = (int) (_unsignednumbers.getSize()-1);
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Private InternalCount = 0 As Int";
_internalcount = (int) (0);
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="Private TempNumber As Int";
_tempnumber = 0;
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="UsePattern.Initialize";
_usepattern.Initialize();
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="For cnt = 0 To PatternCount";
{
final int step15 = 1;
final int limit15 = _patterncount;
_cnt = (int) (0) ;
for (;_cnt <= limit15 ;_cnt = _cnt + step15 ) {
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="TempNumber = unsignedNumbers.Get(InternalCount)";
_tempnumber = (int) ((double)(BA.ObjectToNumber(_unsignednumbers.Get(_internalcount)))%(_basechars.getSize()-1));
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="UsePattern.Append(BaseChars.Get(TempNumber))";
_usepattern.Append(BA.ObjectToString(_basechars.Get(_tempnumber)));
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="BaseChars.RemoveAt(TempNumber)";
_basechars.RemoveAt(_tempnumber);
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="If InternalCount < ByteCount Then";
if (_internalcount<_bytecount) { 
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="InternalCount = InternalCount + 1";
_internalcount = (int) (_internalcount+1);
 }else {
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="InternalCount = 0";
_internalcount = (int) (0);
 };
 }
};
RDebugUtils.currentLine=4063265;
 //BA.debugLineNum = 4063265;BA.debugLine="Return UsePattern";
if (true) return BA.ObjectToString(_usepattern);
RDebugUtils.currentLine=4063266;
 //BA.debugLineNum = 4063266;BA.debugLine="End Sub";
return "";
}
public static byte[]  _generateseed(String _datastring) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "generateseed", false))
	 {return ((byte[]) Debug.delegate(ba, "generateseed", new Object[] {_datastring}));}
byte[] _seedhash = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub GenerateSeed(DataString As String) As";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Private SeedHash() As Byte";
_seedhash = new byte[(int) (0)];
;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="SeedHash = HashLib.GetMessageDigest(DataString.Ge";
_seedhash = _hashlib.GetMessageDigest(_datastring.getBytes("UTF8"),"SHA-512");
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return SeedHash";
if (true) return _seedhash;
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return null;
}
public static String  _plattformdirparent() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "plattformdirparent", false))
	 {return ((String) Debug.delegate(ba, "plattformdirparent", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub PlattformDirParent() As String";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","")).equals("win")) { 
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents\\";
 }else {
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents/";
 };
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="End Sub";
return "";
}
public static String  _clearfilename(String _filename) throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "clearfilename", false))
	 {return ((String) Debug.delegate(ba, "clearfilename", new Object[] {_filename}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub ClearFilename(FileName As String) As S";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="FileName = Regex.Replace(\"[\\ \\.]\", FileName, \"_\")";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[\\ \\.]",_filename,"_");
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="FileName = Regex.Replace(\"[^a-zA-Z0-9_-]\", FileNa";
_filename = anywheresoftware.b4a.keywords.Common.Regex.Replace("[^a-zA-Z0-9_-]",_filename,"");
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Return FileName";
if (true) return _filename;
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="End Sub";
return "";
}
public static String  _strplattformexperience_action() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "strplattformexperience_action", false))
	 {return ((String) Debug.delegate(ba, "strplattformexperience_action", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub strPlattformExperience_Action";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="btnPlattformAdd_Click";
_btnplattformadd_click();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public static String  _strplattformlogin_action() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "strplattformlogin_action", false))
	 {return ((String) Debug.delegate(ba, "strplattformlogin_action", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub strPlattformLogin_Action";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="btnPlattformAdd_Click";
_btnplattformadd_click();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public static String  _strplattformname_action() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "strplattformname_action", false))
	 {return ((String) Debug.delegate(ba, "strplattformname_action", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub strPlattformName_Action";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="btnPlattformAdd_Click";
_btnplattformadd_click();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public static String  _strplattformtarget_action() throws Exception{
RDebugUtils.currentModule="patternmashine";
if (Debug.shouldDelegate(ba, "strplattformtarget_action", false))
	 {return ((String) Debug.delegate(ba, "strplattformtarget_action", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub strPlattformTarget_Action";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="btnPlattformAdd_Click";
_btnplattformadd_click();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
}