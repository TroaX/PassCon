package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 300, 270);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _btnconvert = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strconvertedpass = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _strrawpass = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combochangeplattform = null;
public static anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _hashlib = null;
public static b4j.example.patternmashine _patternmashine = null;
public static b4j.example.helpdialog _helpdialog = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="ListPlattforms";
_listplattforms();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="CheckSelection";
_checkselection();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="End Sub";
return "";
}
public static String  _listplattforms() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "listplattforms", false))
	 {return ((String) Debug.delegate(ba, "listplattforms", null));}
anywheresoftware.b4a.objects.collections.List _plattformfiles = null;
String _value = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub ListPlattforms()";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Private PlattformFiles As List";
_plattformfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="comboChangePlattform.Items.Clear()";
_combochangeplattform.getItems().Clear();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="If File.Exists(PatternMashine.PlattformDir,\"\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_patternmashine._plattformdir /*String*/ (),"")) { 
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="PlattformFiles.Initialize";
_plattformfiles.Initialize();
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="PlattformFiles = File.ListFiles(PatternMashine.P";
_plattformfiles = anywheresoftware.b4a.keywords.Common.File.ListFiles(_patternmashine._plattformdir /*String*/ ());
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="If PlattformFiles.Size > 0 Then";
if (_plattformfiles.getSize()>0) { 
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="For Each Value As String In PlattformFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _plattformfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_value = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="If Value.Contains(\".plat\") Then";
if (_value.contains(".plat")) { 
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="comboChangePlattform.Items.Add(Value.Replace(";
_combochangeplattform.getItems().Add((Object)(_value.replace(".plat","")));
 };
 }
};
 };
 };
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="End Sub";
return "";
}
public static boolean  _checkselection() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkselection", false))
	 {return ((Boolean) Debug.delegate(ba, "checkselection", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub CheckSelection() As Boolean";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If comboChangePlattform.SelectedIndex = -1 Then";
if (_combochangeplattform.getSelectedIndex()==-1) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="btnConvert.Enabled = False";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Red));
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="btnConvert.Enabled = True";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Black));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="End Sub";
return false;
}
public static String  _btnaddplattform_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnaddplattform_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddplattform_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub btnAddPlattform_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="PatternMashine.Show";
_patternmashine._show /*String*/ ();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="ListPlattforms";
_listplattforms();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="CheckSelection";
_checkselection();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="End Sub";
return "";
}
public static String  _btnconvert_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnconvert_click", false))
	 {return ((String) Debug.delegate(ba, "btnconvert_click", null));}
byte[] _hashbytes = null;
int[] _charindexes = null;
int _charcount = 0;
anywheresoftware.b4a.objects.collections.Map _plattformmap = null;
anywheresoftware.b4a.objects.collections.List _filenames = null;
String[] _charlist = null;
String _pattern = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _newpassword = null;
int _cnt = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub btnConvert_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Private HashBytes(64) As Byte";
_hashbytes = new byte[(int) (64)];
;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Private CharIndexes(64) As Int";
_charindexes = new int[(int) (64)];
;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Private CharCount = 0 As Int";
_charcount = (int) (0);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Private PlattformMap As Map";
_plattformmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Private FileNames As List";
_filenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Private CharList() As String";
_charlist = new String[(int) (0)];
java.util.Arrays.fill(_charlist,"");
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="Private Pattern As String";
_pattern = "";
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Private NewPassword As StringBuilder";
_newpassword = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="If strRawPass.Text = \"\" Then";
if ((_strrawpass.getText()).equals("")) { 
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="xui.MsgboxAsync(\"Bitte ein Passwort eintragen!\",";
_xui.MsgboxAsync(ba,"Bitte ein Passwort eintragen!","Fehler");
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="HashBytes = HashLib.GetMessageDigest(strRawPass.T";
_hashbytes = _hashlib.GetMessageDigest(_strrawpass.getText().getBytes("UTF8"),"SHA-512");
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="For cnt = 0 To 63";
{
final int step14 = 1;
final int limit14 = (int) (63);
_cnt = (int) (0) ;
for (;_cnt <= limit14 ;_cnt = _cnt + step14 ) {
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="CharIndexes(cnt) = PatternMashine.ToUnsigned(Has";
_charindexes[_cnt] = _patternmashine._tounsigned /*int*/ (_hashbytes[_cnt]);
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="CharCount = CharCount + CharIndexes(cnt)";
_charcount = (int) (_charcount+_charindexes[_cnt]);
 }
};
RDebugUtils.currentLine=3538965;
 //BA.debugLineNum = 3538965;BA.debugLine="CharCount = (CharCount Mod 16) + 16";
_charcount = (int) ((_charcount%16)+16);
RDebugUtils.currentLine=3538967;
 //BA.debugLineNum = 3538967;BA.debugLine="FileNames.Initialize";
_filenames.Initialize();
RDebugUtils.currentLine=3538968;
 //BA.debugLineNum = 3538968;BA.debugLine="FileNames = comboChangePlattform.Items";
_filenames = _combochangeplattform.getItems();
RDebugUtils.currentLine=3538970;
 //BA.debugLineNum = 3538970;BA.debugLine="PlattformMap.Initialize";
_plattformmap.Initialize();
RDebugUtils.currentLine=3538971;
 //BA.debugLineNum = 3538971;BA.debugLine="PlattformMap = File.ReadMap(PatternMashine.Plattf";
_plattformmap = anywheresoftware.b4a.keywords.Common.File.ReadMap(_patternmashine._plattformdir /*String*/ (),BA.ObjectToString(_filenames.Get(_combochangeplattform.getSelectedIndex()))+".plat");
RDebugUtils.currentLine=3538973;
 //BA.debugLineNum = 3538973;BA.debugLine="If PlattformMap.ContainsKey(\"Plattform\") = False";
if (_plattformmap.ContainsKey((Object)("Plattform"))==anywheresoftware.b4a.keywords.Common.False && _plattformmap.ContainsKey((Object)("Pattern"))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3538974;
 //BA.debugLineNum = 3538974;BA.debugLine="xui.MsgboxAsync(\"Die Plattform-Datei ist ungülti";
_xui.MsgboxAsync(ba,"Die Plattform-Datei ist ungültig","Fataler Fehler!!!");
RDebugUtils.currentLine=3538975;
 //BA.debugLineNum = 3538975;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3538978;
 //BA.debugLineNum = 3538978;BA.debugLine="NewPassword.Initialize";
_newpassword.Initialize();
RDebugUtils.currentLine=3538979;
 //BA.debugLineNum = 3538979;BA.debugLine="Pattern = PlattformMap.Get(\"Pattern\")";
_pattern = BA.ObjectToString(_plattformmap.Get((Object)("Pattern")));
RDebugUtils.currentLine=3538980;
 //BA.debugLineNum = 3538980;BA.debugLine="CharList = Regex.Split(\"\",Pattern)";
_charlist = anywheresoftware.b4a.keywords.Common.Regex.Split("",_pattern);
RDebugUtils.currentLine=3538982;
 //BA.debugLineNum = 3538982;BA.debugLine="For cnt = 0 To CharCount - 1";
{
final int step30 = 1;
final int limit30 = (int) (_charcount-1);
_cnt = (int) (0) ;
for (;_cnt <= limit30 ;_cnt = _cnt + step30 ) {
RDebugUtils.currentLine=3538983;
 //BA.debugLineNum = 3538983;BA.debugLine="NewPassword.Append(CharList(CharIndexes(cnt) Mod";
_newpassword.Append(_charlist[(int) (_charindexes[_cnt]%(_charlist.length-1))]);
 }
};
RDebugUtils.currentLine=3538986;
 //BA.debugLineNum = 3538986;BA.debugLine="strConvertedPass.Text = NewPassword";
_strconvertedpass.setText(BA.ObjectToString(_newpassword));
RDebugUtils.currentLine=3538987;
 //BA.debugLineNum = 3538987;BA.debugLine="End Sub";
return "";
}
public static String  _btnhelp_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnhelp_click", false))
	 {return ((String) Debug.delegate(ba, "btnhelp_click", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub btnHelp_Click";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="HelpDialog.OpenHelp";
_helpdialog._openhelp /*String*/ ();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _btnpasstoclip_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnpasstoclip_click", false))
	 {return ((String) Debug.delegate(ba, "btnpasstoclip_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub btnPassToClip_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If strConvertedPass.Text <> \"\" Then";
if ((_strconvertedpass.getText()).equals("") == false) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="fx.Clipboard.SetString(strConvertedPass.Text)";
_fx.Clipboard.SetString(_strconvertedpass.getText());
 };
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return "";
}
public static String  _combochangeplattform_selectedindexchanged(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "combochangeplattform_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "combochangeplattform_selectedindexchanged", new Object[] {_index,_value}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub comboChangePlattform_SelectedIndexChan";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="CheckSelection";
_checkselection();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _strrawpass_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "strrawpass_action", false))
	 {return ((String) Debug.delegate(ba, "strrawpass_action", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub strRawPass_Action";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="If CheckSelection Then";
if (_checkselection()) { 
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="btnConvert_Click";
_btnconvert_click();
 };
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="End Sub";
return "";
}
}