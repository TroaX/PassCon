package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
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
public static anywheresoftware.b4a.keywords.Common __c = null;
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
 //BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 20;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 21;BA.debugLine="ListPlattforms";
_listplattforms();
 //BA.debugLineNum = 22;BA.debugLine="CheckSelection";
_checkselection();
 //BA.debugLineNum = 23;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 24;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddplattform_click() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub btnAddPlattform_Click";
 //BA.debugLineNum = 103;BA.debugLine="PatternMashine.Show";
_patternmashine._show /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="ListPlattforms";
_listplattforms();
 //BA.debugLineNum = 105;BA.debugLine="CheckSelection";
_checkselection();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _btnconvert_click() throws Exception{
byte[] _hashbytes = null;
int[] _charindexes = null;
int _charcount = 0;
anywheresoftware.b4a.objects.collections.Map _plattformmap = null;
anywheresoftware.b4a.objects.collections.List _filenames = null;
String[] _charlist = null;
String _pattern = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _newpassword = null;
int _cnt = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub btnConvert_Click";
 //BA.debugLineNum = 58;BA.debugLine="Private HashBytes(64) As Byte";
_hashbytes = new byte[(int) (64)];
;
 //BA.debugLineNum = 59;BA.debugLine="Private CharIndexes(64) As Int";
_charindexes = new int[(int) (64)];
;
 //BA.debugLineNum = 60;BA.debugLine="Private CharCount = 0 As Int";
_charcount = (int) (0);
 //BA.debugLineNum = 61;BA.debugLine="Private PlattformMap As Map";
_plattformmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 62;BA.debugLine="Private FileNames As List";
_filenames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 63;BA.debugLine="Private CharList() As String";
_charlist = new String[(int) (0)];
java.util.Arrays.fill(_charlist,"");
 //BA.debugLineNum = 64;BA.debugLine="Private Pattern As String";
_pattern = "";
 //BA.debugLineNum = 65;BA.debugLine="Private NewPassword As StringBuilder";
_newpassword = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 67;BA.debugLine="If strRawPass.Text = \"\" Then";
if ((_strrawpass.getText()).equals("")) { 
 //BA.debugLineNum = 68;BA.debugLine="xui.MsgboxAsync(\"Bitte ein Passwort eintragen!\",";
_xui.MsgboxAsync(ba,"Bitte ein Passwort eintragen!","Fehler");
 //BA.debugLineNum = 69;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 71;BA.debugLine="HashBytes = HashLib.GetMessageDigest(strRawPass.T";
_hashbytes = _hashlib.GetMessageDigest(_strrawpass.getText().getBytes("UTF8"),"SHA-512");
 //BA.debugLineNum = 73;BA.debugLine="For cnt = 0 To 63";
{
final int step14 = 1;
final int limit14 = (int) (63);
_cnt = (int) (0) ;
for (;_cnt <= limit14 ;_cnt = _cnt + step14 ) {
 //BA.debugLineNum = 74;BA.debugLine="CharIndexes(cnt) = PatternMashine.ToUnsigned(Has";
_charindexes[_cnt] = _patternmashine._tounsigned /*int*/ (_hashbytes[_cnt]);
 //BA.debugLineNum = 75;BA.debugLine="CharCount = CharCount + CharIndexes(cnt)";
_charcount = (int) (_charcount+_charindexes[_cnt]);
 }
};
 //BA.debugLineNum = 78;BA.debugLine="CharCount = (CharCount Mod 16) + 16";
_charcount = (int) ((_charcount%16)+16);
 //BA.debugLineNum = 80;BA.debugLine="FileNames.Initialize";
_filenames.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="FileNames = comboChangePlattform.Items";
_filenames = _combochangeplattform.getItems();
 //BA.debugLineNum = 83;BA.debugLine="PlattformMap.Initialize";
_plattformmap.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="PlattformMap = File.ReadMap(PatternMashine.Plattf";
_plattformmap = anywheresoftware.b4a.keywords.Common.File.ReadMap(_patternmashine._plattformdir /*String*/ (),BA.ObjectToString(_filenames.Get(_combochangeplattform.getSelectedIndex()))+".plat");
 //BA.debugLineNum = 86;BA.debugLine="If PlattformMap.ContainsKey(\"Plattform\") = False";
if (_plattformmap.ContainsKey((Object)("Plattform"))==anywheresoftware.b4a.keywords.Common.False && _plattformmap.ContainsKey((Object)("Pattern"))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 87;BA.debugLine="xui.MsgboxAsync(\"Die Plattform-Datei ist ungülti";
_xui.MsgboxAsync(ba,"Die Plattform-Datei ist ungültig","Fataler Fehler!!!");
 //BA.debugLineNum = 88;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 91;BA.debugLine="NewPassword.Initialize";
_newpassword.Initialize();
 //BA.debugLineNum = 92;BA.debugLine="Pattern = PlattformMap.Get(\"Pattern\")";
_pattern = BA.ObjectToString(_plattformmap.Get((Object)("Pattern")));
 //BA.debugLineNum = 93;BA.debugLine="CharList = Regex.Split(\"\",Pattern)";
_charlist = anywheresoftware.b4a.keywords.Common.Regex.Split("",_pattern);
 //BA.debugLineNum = 95;BA.debugLine="For cnt = 0 To CharCount - 1";
{
final int step30 = 1;
final int limit30 = (int) (_charcount-1);
_cnt = (int) (0) ;
for (;_cnt <= limit30 ;_cnt = _cnt + step30 ) {
 //BA.debugLineNum = 96;BA.debugLine="NewPassword.Append(CharList(CharIndexes(cnt) Mod";
_newpassword.Append(_charlist[(int) (_charindexes[_cnt]%(_charindexes.length-1))]);
 }
};
 //BA.debugLineNum = 99;BA.debugLine="strConvertedPass.Text = NewPassword";
_strconvertedpass.setText(BA.ObjectToString(_newpassword));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _btnhelp_click() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Private Sub btnHelp_Click";
 //BA.debugLineNum = 119;BA.debugLine="HelpDialog.OpenHelp";
_helpdialog._openhelp /*String*/ ();
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _btnpasstoclip_click() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Private Sub btnPassToClip_Click";
 //BA.debugLineNum = 109;BA.debugLine="If strConvertedPass.Text <> \"\" Then";
if ((_strconvertedpass.getText()).equals("") == false) { 
 //BA.debugLineNum = 110;BA.debugLine="fx.Clipboard.SetString(strConvertedPass.Text)";
_fx.Clipboard.SetString(_strconvertedpass.getText());
 };
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public static String  _checkselection() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Private Sub CheckSelection()";
 //BA.debugLineNum = 29;BA.debugLine="If comboChangePlattform.SelectedIndex = -1 Then";
if (_combochangeplattform.getSelectedIndex()==-1) { 
 //BA.debugLineNum = 30;BA.debugLine="btnConvert.Enabled = False";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 31;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Red));
 }else {
 //BA.debugLineNum = 33;BA.debugLine="btnConvert.Enabled = True";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Black));
 };
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _combochangeplattform_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Private Sub comboChangePlattform_SelectedIndexChan";
 //BA.debugLineNum = 115;BA.debugLine="CheckSelection";
_checkselection();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public static String  _listplattforms() throws Exception{
anywheresoftware.b4a.objects.collections.List _plattformfiles = null;
String _value = "";
 //BA.debugLineNum = 39;BA.debugLine="Private Sub ListPlattforms()";
 //BA.debugLineNum = 40;BA.debugLine="Private PlattformFiles As List";
_plattformfiles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 41;BA.debugLine="comboChangePlattform.Items.Clear()";
_combochangeplattform.getItems().Clear();
 //BA.debugLineNum = 42;BA.debugLine="If File.Exists(PatternMashine.PlattformDir,\"\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_patternmashine._plattformdir /*String*/ (),"")) { 
 //BA.debugLineNum = 43;BA.debugLine="PlattformFiles.Initialize";
_plattformfiles.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="PlattformFiles = File.ListFiles(PatternMashine.P";
_plattformfiles = anywheresoftware.b4a.keywords.Common.File.ListFiles(_patternmashine._plattformdir /*String*/ ());
 //BA.debugLineNum = 45;BA.debugLine="If PlattformFiles.Size > 0 Then";
if (_plattformfiles.getSize()>0) { 
 //BA.debugLineNum = 46;BA.debugLine="For Each Value As String In PlattformFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _plattformfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_value = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 47;BA.debugLine="If Value.Contains(\".plat\") Then";
if (_value.contains(".plat")) { 
 //BA.debugLineNum = 48;BA.debugLine="comboChangePlattform.Items.Add(Value.Replace(";
_combochangeplattform.getItems().Add((Object)(_value.replace(".plat","")));
 };
 }
};
 };
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
patternmashine._process_globals();
helpdialog._process_globals();
b4xcollections._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Private btnConvert As B4XView";
_btnconvert = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private strConvertedPass As TextField";
_strconvertedpass = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private strRawPass As TextField";
_strrawpass = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private comboChangePlattform As ComboBox";
_combochangeplattform = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private HashLib As MessageDigest";
_hashlib = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
}
