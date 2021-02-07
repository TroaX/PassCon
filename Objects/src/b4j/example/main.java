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
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub ListPlattforms()";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private PlattformFiles As List";
_plattformfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="comboChangePlattform.Items.Clear()";
_combochangeplattform.getItems().Clear();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="If File.Exists(PatternMashine.PlattformDir,\"\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_patternmashine._plattformdir /*String*/ (),"")) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="PlattformFiles.Initialize";
_plattformfiles.Initialize();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="PlattformFiles = File.ListFiles(PatternMashine.P";
_plattformfiles = anywheresoftware.b4a.keywords.Common.File.ListFiles(_patternmashine._plattformdir /*String*/ ());
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="If PlattformFiles.Size > 0 Then";
if (_plattformfiles.getSize()>0) { 
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="For Each Value As String In PlattformFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _plattformfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_value = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="If Value.Contains(\".plat\") Then";
if (_value.contains(".plat")) { 
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="comboChangePlattform.Items.Add(Value.Replace(";
_combochangeplattform.getItems().Add((Object)(_value.replace(".plat","")));
 };
 }
};
 };
 };
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="End Sub";
return "";
}
public static String  _checkselection() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkselection", false))
	 {return ((String) Debug.delegate(ba, "checkselection", null));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub CheckSelection()";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If comboChangePlattform.SelectedIndex = -1 Then";
if (_combochangeplattform.getSelectedIndex()==-1) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="btnConvert.Enabled = False";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Red));
 }else {
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="btnConvert.Enabled = True";
_btnconvert.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
_btnconvert.setTextColor(_fx.Colors.To32Bit(_fx.Colors.Black));
 };
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddplattform_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnaddplattform_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddplattform_click", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub btnAddPlattform_Click";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="PatternMashine.Show";
_patternmashine._show /*String*/ ();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ListPlattforms";
_listplattforms();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="CheckSelection";
_checkselection();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub btnConvert_Click";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private HashBytes(64) As Byte";
_hashbytes = new byte[(int) (64)];
;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private CharIndexes(64) As Int";
_charindexes = new int[(int) (64)];
;
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private CharCount = 0 As Int";
_charcount = (int) (0);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private PlattformMap As Map";
_plattformmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private FileNames As List";
_filenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Private CharList() As String";
_charlist = new String[(int) (0)];
java.util.Arrays.fill(_charlist,"");
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Private Pattern As String";
_pattern = "";
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Private NewPassword As StringBuilder";
_newpassword = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="If strRawPass.Text = \"\" Then";
if ((_strrawpass.getText()).equals("")) { 
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="xui.MsgboxAsync(\"Bitte ein Passwort eintragen!\",";
_xui.MsgboxAsync(ba,"Bitte ein Passwort eintragen!","Fehler");
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="HashBytes = HashLib.GetMessageDigest(strRawPass.T";
_hashbytes = _hashlib.GetMessageDigest(_strrawpass.getText().getBytes("UTF8"),"SHA-512");
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="For cnt = 0 To 63";
{
final int step14 = 1;
final int limit14 = (int) (63);
_cnt = (int) (0) ;
for (;_cnt <= limit14 ;_cnt = _cnt + step14 ) {
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="CharIndexes(cnt) = PatternMashine.ToUnsigned(Has";
_charindexes[_cnt] = _patternmashine._tounsigned /*int*/ (_hashbytes[_cnt]);
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="CharCount = CharCount + CharIndexes(cnt)";
_charcount = (int) (_charcount+_charindexes[_cnt]);
 }
};
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="CharCount = (CharCount Mod 16) + 16";
_charcount = (int) ((_charcount%16)+16);
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="FileNames.Initialize";
_filenames.Initialize();
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="FileNames = comboChangePlattform.Items";
_filenames = _combochangeplattform.getItems();
RDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="PlattformMap.Initialize";
_plattformmap.Initialize();
RDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="PlattformMap = File.ReadMap(PatternMashine.Plattf";
_plattformmap = anywheresoftware.b4a.keywords.Common.File.ReadMap(_patternmashine._plattformdir /*String*/ (),BA.ObjectToString(_filenames.Get(_combochangeplattform.getSelectedIndex()))+".plat");
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="If PlattformMap.ContainsKey(\"Plattform\") = False";
if (_plattformmap.ContainsKey((Object)("Plattform"))==anywheresoftware.b4a.keywords.Common.False && _plattformmap.ContainsKey((Object)("Pattern"))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="xui.MsgboxAsync(\"Die Plattform-Datei ist ungülti";
_xui.MsgboxAsync(ba,"Die Plattform-Datei ist ungültig","Fataler Fehler!!!");
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="NewPassword.Initialize";
_newpassword.Initialize();
RDebugUtils.currentLine=262179;
 //BA.debugLineNum = 262179;BA.debugLine="Pattern = PlattformMap.Get(\"Pattern\")";
_pattern = BA.ObjectToString(_plattformmap.Get((Object)("Pattern")));
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="CharList = Regex.Split(\"\",Pattern)";
_charlist = anywheresoftware.b4a.keywords.Common.Regex.Split("",_pattern);
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="For cnt = 0 To CharCount - 1";
{
final int step30 = 1;
final int limit30 = (int) (_charcount-1);
_cnt = (int) (0) ;
for (;_cnt <= limit30 ;_cnt = _cnt + step30 ) {
RDebugUtils.currentLine=262183;
 //BA.debugLineNum = 262183;BA.debugLine="NewPassword.Append(CharList(CharIndexes(cnt) Mod";
_newpassword.Append(_charlist[(int) (_charindexes[_cnt]%(_charlist.length-1))]);
 }
};
RDebugUtils.currentLine=262186;
 //BA.debugLineNum = 262186;BA.debugLine="strConvertedPass.Text = NewPassword";
_strconvertedpass.setText(BA.ObjectToString(_newpassword));
RDebugUtils.currentLine=262187;
 //BA.debugLineNum = 262187;BA.debugLine="End Sub";
return "";
}
public static String  _btnhelp_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnhelp_click", false))
	 {return ((String) Debug.delegate(ba, "btnhelp_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub btnHelp_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="HelpDialog.OpenHelp";
_helpdialog._openhelp /*String*/ ();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _btnpasstoclip_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnpasstoclip_click", false))
	 {return ((String) Debug.delegate(ba, "btnpasstoclip_click", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub btnPassToClip_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If strConvertedPass.Text <> \"\" Then";
if ((_strconvertedpass.getText()).equals("") == false) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="fx.Clipboard.SetString(strConvertedPass.Text)";
_fx.Clipboard.SetString(_strconvertedpass.getText());
 };
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static String  _combochangeplattform_selectedindexchanged(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "combochangeplattform_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "combochangeplattform_selectedindexchanged", new Object[] {_index,_value}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub comboChangePlattform_SelectedIndexChan";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="CheckSelection";
_checkselection();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
}