package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(262144);
main._mainform = _form1;
 BA.debugLineNum = 20;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
Debug.ShouldStop(524288);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 21;BA.debugLine="ListPlattforms";
Debug.ShouldStop(1048576);
_listplattforms();
 BA.debugLineNum = 22;BA.debugLine="CheckSelection";
Debug.ShouldStop(2097152);
_checkselection();
 BA.debugLineNum = 23;BA.debugLine="MainForm.Resizable = False";
Debug.ShouldStop(4194304);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="MainForm.Show";
Debug.ShouldStop(8388608);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddplattform_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddPlattform_Click (main) ","main",0,main.ba,main.mostCurrent,104);
if (RapidSub.canDelegate("btnaddplattform_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnaddplattform_click");}
 BA.debugLineNum = 104;BA.debugLine="Private Sub btnAddPlattform_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="PatternMashine.Show";
Debug.ShouldStop(256);
main._patternmashine.runVoidMethod ("_show" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="ListPlattforms";
Debug.ShouldStop(512);
_listplattforms();
 BA.debugLineNum = 107;BA.debugLine="CheckSelection";
Debug.ShouldStop(1024);
_checkselection();
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconvert_click() throws Exception{
try {
		Debug.PushSubsStack("btnConvert_Click (main) ","main",0,main.ba,main.mostCurrent,59);
if (RapidSub.canDelegate("btnconvert_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnconvert_click");}
RemoteObject _hashbytes = null;
RemoteObject _charindexes = null;
RemoteObject _charcount = RemoteObject.createImmutable(0);
RemoteObject _plattformmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filenames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _charlist = null;
RemoteObject _pattern = RemoteObject.createImmutable("");
RemoteObject _newpassword = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _cnt = 0;
 BA.debugLineNum = 59;BA.debugLine="Private Sub btnConvert_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Private HashBytes(64) As Byte";
Debug.ShouldStop(134217728);
_hashbytes = RemoteObject.createNewArray ("byte", new int[] {64}, new Object[]{});Debug.locals.put("HashBytes", _hashbytes);
 BA.debugLineNum = 61;BA.debugLine="Private CharIndexes(64) As Int";
Debug.ShouldStop(268435456);
_charindexes = RemoteObject.createNewArray ("int", new int[] {64}, new Object[]{});Debug.locals.put("CharIndexes", _charindexes);
 BA.debugLineNum = 62;BA.debugLine="Private CharCount = 0 As Int";
Debug.ShouldStop(536870912);
_charcount = BA.numberCast(int.class, 0);Debug.locals.put("CharCount", _charcount);Debug.locals.put("CharCount", _charcount);
 BA.debugLineNum = 63;BA.debugLine="Private PlattformMap As Map";
Debug.ShouldStop(1073741824);
_plattformmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("PlattformMap", _plattformmap);
 BA.debugLineNum = 64;BA.debugLine="Private FileNames As List";
Debug.ShouldStop(-2147483648);
_filenames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FileNames", _filenames);
 BA.debugLineNum = 65;BA.debugLine="Private CharList() As String";
Debug.ShouldStop(1);
_charlist = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("CharList", _charlist);
 BA.debugLineNum = 66;BA.debugLine="Private Pattern As String";
Debug.ShouldStop(2);
_pattern = RemoteObject.createImmutable("");Debug.locals.put("Pattern", _pattern);
 BA.debugLineNum = 67;BA.debugLine="Private NewPassword As StringBuilder";
Debug.ShouldStop(4);
_newpassword = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("NewPassword", _newpassword);
 BA.debugLineNum = 69;BA.debugLine="If strRawPass.Text = \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._strrawpass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 70;BA.debugLine="xui.MsgboxAsync(\"Bitte ein Passwort eintragen!\",";
Debug.ShouldStop(32);
main._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Bitte ein Passwort eintragen!")),(Object)(RemoteObject.createImmutable("Fehler")));
 BA.debugLineNum = 71;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 73;BA.debugLine="HashBytes = HashLib.GetMessageDigest(strRawPass.T";
Debug.ShouldStop(256);
_hashbytes = main._hashlib.runMethod(false,"GetMessageDigest",(Object)(main._strrawpass.runMethod(true,"getText").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("SHA-512")));Debug.locals.put("HashBytes", _hashbytes);
 BA.debugLineNum = 75;BA.debugLine="For cnt = 0 To 63";
Debug.ShouldStop(1024);
{
final int step14 = 1;
final int limit14 = 63;
_cnt = 0 ;
for (;(step14 > 0 && _cnt <= limit14) || (step14 < 0 && _cnt >= limit14) ;_cnt = ((int)(0 + _cnt + step14))  ) {
Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 76;BA.debugLine="CharIndexes(cnt) = PatternMashine.ToUnsigned(Has";
Debug.ShouldStop(2048);
_charindexes.setArrayElement (main._patternmashine.runMethod(true,"_tounsigned" /*RemoteObject*/ ,(Object)(_hashbytes.getArrayElement(true,BA.numberCast(int.class, _cnt)))),BA.numberCast(int.class, _cnt));
 BA.debugLineNum = 77;BA.debugLine="CharCount = CharCount + CharIndexes(cnt)";
Debug.ShouldStop(4096);
_charcount = RemoteObject.solve(new RemoteObject[] {_charcount,_charindexes.getArrayElement(true,BA.numberCast(int.class, _cnt))}, "+",1, 1);Debug.locals.put("CharCount", _charcount);
 }
}Debug.locals.put("cnt", _cnt);
;
 BA.debugLineNum = 80;BA.debugLine="CharCount = (CharCount Mod 16) + 16";
Debug.ShouldStop(32768);
_charcount = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_charcount,RemoteObject.createImmutable(16)}, "%",0, 1)),RemoteObject.createImmutable(16)}, "+",1, 1);Debug.locals.put("CharCount", _charcount);
 BA.debugLineNum = 82;BA.debugLine="FileNames.Initialize";
Debug.ShouldStop(131072);
_filenames.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="FileNames = comboChangePlattform.Items";
Debug.ShouldStop(262144);
_filenames = main._combochangeplattform.runMethod(false,"getItems");Debug.locals.put("FileNames", _filenames);
 BA.debugLineNum = 85;BA.debugLine="PlattformMap.Initialize";
Debug.ShouldStop(1048576);
_plattformmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="PlattformMap = File.ReadMap(PatternMashine.Plattf";
Debug.ShouldStop(2097152);
_plattformmap = main.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(main._patternmashine.runMethod(true,"_plattformdir" /*RemoteObject*/ )),(Object)(RemoteObject.concat(_filenames.runMethod(false,"Get",(Object)(main._combochangeplattform.runMethod(true,"getSelectedIndex"))),RemoteObject.createImmutable(".plat"))));Debug.locals.put("PlattformMap", _plattformmap);
 BA.debugLineNum = 88;BA.debugLine="If PlattformMap.ContainsKey(\"Plattform\") = False";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_plattformmap.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Plattform")))),main.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_plattformmap.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Pattern")))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 89;BA.debugLine="xui.MsgboxAsync(\"Die Plattform-Datei ist ungülti";
Debug.ShouldStop(16777216);
main._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Die Plattform-Datei ist ungültig")),(Object)(RemoteObject.createImmutable("Fataler Fehler!!!")));
 BA.debugLineNum = 90;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 93;BA.debugLine="NewPassword.Initialize";
Debug.ShouldStop(268435456);
_newpassword.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="Pattern = PlattformMap.Get(\"Pattern\")";
Debug.ShouldStop(536870912);
_pattern = BA.ObjectToString(_plattformmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pattern")))));Debug.locals.put("Pattern", _pattern);
 BA.debugLineNum = 95;BA.debugLine="CharList = Regex.Split(\"\",Pattern)";
Debug.ShouldStop(1073741824);
_charlist = main.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("")),(Object)(_pattern));Debug.locals.put("CharList", _charlist);
 BA.debugLineNum = 97;BA.debugLine="For cnt = 0 To CharCount - 1";
Debug.ShouldStop(1);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_charcount,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_cnt = 0 ;
for (;(step30 > 0 && _cnt <= limit30) || (step30 < 0 && _cnt >= limit30) ;_cnt = ((int)(0 + _cnt + step30))  ) {
Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 98;BA.debugLine="NewPassword.Append(CharList(CharIndexes(cnt) Mod";
Debug.ShouldStop(2);
_newpassword.runVoidMethod ("Append",(Object)(_charlist.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_charindexes.getArrayElement(true,BA.numberCast(int.class, _cnt)),(RemoteObject.solve(new RemoteObject[] {_charlist.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "%",0, 1))));
 }
}Debug.locals.put("cnt", _cnt);
;
 BA.debugLineNum = 101;BA.debugLine="strConvertedPass.Text = NewPassword";
Debug.ShouldStop(16);
main._strconvertedpass.runMethod(true,"setText",BA.ObjectToString(_newpassword));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhelp_click() throws Exception{
try {
		Debug.PushSubsStack("btnHelp_Click (main) ","main",0,main.ba,main.mostCurrent,120);
if (RapidSub.canDelegate("btnhelp_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnhelp_click");}
 BA.debugLineNum = 120;BA.debugLine="Private Sub btnHelp_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="HelpDialog.OpenHelp";
Debug.ShouldStop(16777216);
main._helpdialog.runVoidMethod ("_openhelp" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpasstoclip_click() throws Exception{
try {
		Debug.PushSubsStack("btnPassToClip_Click (main) ","main",0,main.ba,main.mostCurrent,110);
if (RapidSub.canDelegate("btnpasstoclip_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnpasstoclip_click");}
 BA.debugLineNum = 110;BA.debugLine="Private Sub btnPassToClip_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If strConvertedPass.Text <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",main._strconvertedpass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 112;BA.debugLine="fx.Clipboard.SetString(strConvertedPass.Text)";
Debug.ShouldStop(32768);
main._fx.getField(false,"Clipboard").runVoidMethod ("SetString",(Object)(main._strconvertedpass.runMethod(true,"getText")));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkselection() throws Exception{
try {
		Debug.PushSubsStack("CheckSelection (main) ","main",0,main.ba,main.mostCurrent,28);
if (RapidSub.canDelegate("checkselection")) { return b4j.example.main.remoteMe.runUserSub(false, "main","checkselection");}
 BA.debugLineNum = 28;BA.debugLine="Private Sub CheckSelection() As Boolean";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If comboChangePlattform.SelectedIndex = -1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._combochangeplattform.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 30;BA.debugLine="btnConvert.Enabled = False";
Debug.ShouldStop(536870912);
main._btnconvert.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
Debug.ShouldStop(1073741824);
main._btnconvert.runMethod(true,"setTextColor",main._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)(main._fx.getField(false,"Colors").getField(false,"Red"))));
 BA.debugLineNum = 32;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return main.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 34;BA.debugLine="btnConvert.Enabled = True";
Debug.ShouldStop(2);
main._btnconvert.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="btnConvert.TextColor = fx.Colors.To32Bit(fx.Colo";
Debug.ShouldStop(4);
main._btnconvert.runMethod(true,"setTextColor",main._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)(main._fx.getField(false,"Colors").getField(false,"Black"))));
 BA.debugLineNum = 36;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return main.__c.getField(true,"True");
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _combochangeplattform_selectedindexchanged(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("comboChangePlattform_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,116);
if (RapidSub.canDelegate("combochangeplattform_selectedindexchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","combochangeplattform_selectedindexchanged", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 116;BA.debugLine="Private Sub comboChangePlattform_SelectedIndexChan";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="CheckSelection";
Debug.ShouldStop(1048576);
_checkselection();
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listplattforms() throws Exception{
try {
		Debug.PushSubsStack("ListPlattforms (main) ","main",0,main.ba,main.mostCurrent,41);
if (RapidSub.canDelegate("listplattforms")) { return b4j.example.main.remoteMe.runUserSub(false, "main","listplattforms");}
RemoteObject _plattformfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _value = RemoteObject.createImmutable("");
 BA.debugLineNum = 41;BA.debugLine="Private Sub ListPlattforms()";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Private PlattformFiles As List";
Debug.ShouldStop(512);
_plattformfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("PlattformFiles", _plattformfiles);
 BA.debugLineNum = 43;BA.debugLine="comboChangePlattform.Items.Clear()";
Debug.ShouldStop(1024);
main._combochangeplattform.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 44;BA.debugLine="If File.Exists(PatternMashine.PlattformDir,\"\") Th";
Debug.ShouldStop(2048);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._patternmashine.runMethod(true,"_plattformdir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="PlattformFiles.Initialize";
Debug.ShouldStop(4096);
_plattformfiles.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="PlattformFiles = File.ListFiles(PatternMashine.P";
Debug.ShouldStop(8192);
_plattformfiles = main.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(main._patternmashine.runMethod(true,"_plattformdir" /*RemoteObject*/ )));Debug.locals.put("PlattformFiles", _plattformfiles);
 BA.debugLineNum = 47;BA.debugLine="If PlattformFiles.Size > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_plattformfiles.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 48;BA.debugLine="For Each Value As String In PlattformFiles";
Debug.ShouldStop(32768);
{
final RemoteObject group7 = _plattformfiles;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_value = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("Value", _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 49;BA.debugLine="If Value.Contains(\".plat\") Then";
Debug.ShouldStop(65536);
if (_value.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(".plat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="comboChangePlattform.Items.Add(Value.Replace(";
Debug.ShouldStop(131072);
main._combochangeplattform.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_value.runMethod(true,"replace",(Object)(BA.ObjectToString(".plat")),(Object)(RemoteObject.createImmutable(""))))));
 };
 }
}Debug.locals.put("Value", _value);
;
 };
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
patternmashine_subs_0._process_globals();
helpdialog_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
patternmashine.myClass = BA.getDeviceClass ("b4j.example.patternmashine");
helpdialog.myClass = BA.getDeviceClass ("b4j.example.helpdialog");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private btnConvert As B4XView";
main._btnconvert = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private strConvertedPass As TextField";
main._strconvertedpass = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private strRawPass As TextField";
main._strrawpass = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private comboChangePlattform As ComboBox";
main._combochangeplattform = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private HashLib As MessageDigest";
main._hashlib = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _strrawpass_action() throws Exception{
try {
		Debug.PushSubsStack("strRawPass_Action (main) ","main",0,main.ba,main.mostCurrent,124);
if (RapidSub.canDelegate("strrawpass_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","strrawpass_action");}
 BA.debugLineNum = 124;BA.debugLine="Private Sub strRawPass_Action";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="If CheckSelection Then";
Debug.ShouldStop(268435456);
if (_checkselection().<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="btnConvert_Click";
Debug.ShouldStop(536870912);
_btnconvert_click();
 };
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}