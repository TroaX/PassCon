package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class patternmashine_subs_0 {


public static RemoteObject  _btnplattformadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnPlattformAdd_Click (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,79);
if (RapidSub.canDelegate("btnplattformadd_click")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","btnplattformadd_click");}
RemoteObject _basepattern = RemoteObject.createImmutable("");
RemoteObject _targetpattern = RemoteObject.createImmutable("");
RemoteObject _savefile = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _message = RemoteObject.createImmutable("");
RemoteObject _directory = RemoteObject.createImmutable("");
RemoteObject _dirparent = RemoteObject.createImmutable("");
 BA.debugLineNum = 79;BA.debugLine="Private Sub btnPlattformAdd_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Private BasePattern As String";
Debug.ShouldStop(32768);
_basepattern = RemoteObject.createImmutable("");Debug.locals.put("BasePattern", _basepattern);
 BA.debugLineNum = 81;BA.debugLine="Private TargetPattern As String";
Debug.ShouldStop(65536);
_targetpattern = RemoteObject.createImmutable("");Debug.locals.put("TargetPattern", _targetpattern);
 BA.debugLineNum = 82;BA.debugLine="Private SaveFile As Map";
Debug.ShouldStop(131072);
_savefile = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("SaveFile", _savefile);
 BA.debugLineNum = 83;BA.debugLine="Private Message = \"\" As String";
Debug.ShouldStop(262144);
_message = BA.ObjectToString("");Debug.locals.put("Message", _message);Debug.locals.put("Message", _message);
 BA.debugLineNum = 85;BA.debugLine="If strPlattformName.Text.Trim = \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",patternmashine._strplattformname.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 86;BA.debugLine="Message = Message & \"Bitte Plattfrom-Namen eintr";
Debug.ShouldStop(2097152);
_message = RemoteObject.concat(_message,RemoteObject.createImmutable("Bitte Plattfrom-Namen eintragen"),patternmashine.__c.getField(true,"CRLF"));Debug.locals.put("Message", _message);
 };
 BA.debugLineNum = 88;BA.debugLine="If strPlattformTarget.Text.Trim = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",patternmashine._strplattformtarget.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 89;BA.debugLine="Message = Message & \"Bitte Plattfrom-Zweck eintr";
Debug.ShouldStop(16777216);
_message = RemoteObject.concat(_message,RemoteObject.createImmutable("Bitte Plattfrom-Zweck eintragen"),patternmashine.__c.getField(true,"CRLF"));Debug.locals.put("Message", _message);
 };
 BA.debugLineNum = 91;BA.debugLine="If strPlattformLogin.Text.Trim = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",patternmashine._strplattformlogin.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 92;BA.debugLine="Message = Message & \"Bitte Plattfrom-Login eintr";
Debug.ShouldStop(134217728);
_message = RemoteObject.concat(_message,RemoteObject.createImmutable("Bitte Plattfrom-Login eintragen"),patternmashine.__c.getField(true,"CRLF"));Debug.locals.put("Message", _message);
 };
 BA.debugLineNum = 94;BA.debugLine="If strPlattformExperience.Text.Trim = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",patternmashine._strplattformexperience.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 95;BA.debugLine="Message = Message & \"Bitte Plattfrom-Erfahrung e";
Debug.ShouldStop(1073741824);
_message = RemoteObject.concat(_message,RemoteObject.createImmutable("Bitte Plattfrom-Erfahrung eintragen"),patternmashine.__c.getField(true,"CRLF"));Debug.locals.put("Message", _message);
 };
 BA.debugLineNum = 98;BA.debugLine="If Message <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_message,BA.ObjectToString(""))) { 
 BA.debugLineNum = 99;BA.debugLine="XUI.MsgboxAsync(Message, \"Hinweis\")";
Debug.ShouldStop(4);
patternmashine._xui.runVoidMethod ("MsgboxAsync",patternmashine.ba,(Object)(_message),(Object)(RemoteObject.createImmutable("Hinweis")));
 BA.debugLineNum = 100;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 103;BA.debugLine="BasePattern = \"AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHII";
Debug.ShouldStop(64);
_basepattern = BA.ObjectToString("AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTTUUUUVVVVWWWWXXXXYYYYZZZZ");Debug.locals.put("BasePattern", _basepattern);
 BA.debugLineNum = 104;BA.debugLine="BasePattern = BasePattern & \"aaaabbbbccccddddeeee";
Debug.ShouldStop(128);
_basepattern = RemoteObject.concat(_basepattern,RemoteObject.createImmutable("aaaabbbbccccddddeeeeffffgggghhhhiiiijjjjkkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuuvvvvwwwwxxxxyyyyzzzz"));Debug.locals.put("BasePattern", _basepattern);
 BA.debugLineNum = 105;BA.debugLine="BasePattern = BasePattern & \"00001111222233334444";
Debug.ShouldStop(256);
_basepattern = RemoteObject.concat(_basepattern,RemoteObject.createImmutable("0000111122223333444455556666777788889999--__::;;..,,!!$$%%&&??"));Debug.locals.put("BasePattern", _basepattern);
 BA.debugLineNum = 107;BA.debugLine="TargetPattern = GeneratePattern(BasePattern, Gene";
Debug.ShouldStop(1024);
_targetpattern = _generatepattern(_basepattern,_generateseed(patternmashine._strplattformname.runMethod(true,"getText").runMethod(true,"trim")));Debug.locals.put("TargetPattern", _targetpattern);
 BA.debugLineNum = 108;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
Debug.ShouldStop(2048);
_targetpattern = _generatepattern(_targetpattern,_generateseed(patternmashine._strplattformtarget.runMethod(true,"getText").runMethod(true,"trim")));Debug.locals.put("TargetPattern", _targetpattern);
 BA.debugLineNum = 109;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
Debug.ShouldStop(4096);
_targetpattern = _generatepattern(_targetpattern,_generateseed(patternmashine._strplattformlogin.runMethod(true,"getText").runMethod(true,"trim")));Debug.locals.put("TargetPattern", _targetpattern);
 BA.debugLineNum = 110;BA.debugLine="TargetPattern = GeneratePattern(TargetPattern, Ge";
Debug.ShouldStop(8192);
_targetpattern = _generatepattern(_targetpattern,_generateseed(patternmashine._strplattformexperience.runMethod(true,"getText").runMethod(true,"trim")));Debug.locals.put("TargetPattern", _targetpattern);
 BA.debugLineNum = 112;BA.debugLine="SaveFile.Initialize";
Debug.ShouldStop(32768);
_savefile.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="SaveFile.Put(\"Plattform\", strPlattformName.Text.T";
Debug.ShouldStop(65536);
_savefile.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Plattform"))),(Object)((patternmashine._strplattformname.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 114;BA.debugLine="SaveFile.Put(\"Pattern\", TargetPattern)";
Debug.ShouldStop(131072);
_savefile.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Pattern"))),(Object)((_targetpattern)));
 BA.debugLineNum = 116;BA.debugLine="Private Directory As String";
Debug.ShouldStop(524288);
_directory = RemoteObject.createImmutable("");Debug.locals.put("Directory", _directory);
 BA.debugLineNum = 117;BA.debugLine="Private DirParent As String";
Debug.ShouldStop(1048576);
_dirparent = RemoteObject.createImmutable("");Debug.locals.put("DirParent", _dirparent);
 BA.debugLineNum = 119;BA.debugLine="Directory = PlattformDir";
Debug.ShouldStop(4194304);
_directory = _plattformdir();Debug.locals.put("Directory", _directory);
 BA.debugLineNum = 120;BA.debugLine="DirParent = PlattformDirParent";
Debug.ShouldStop(8388608);
_dirparent = _plattformdirparent();Debug.locals.put("DirParent", _dirparent);
 BA.debugLineNum = 122;BA.debugLine="If File.Exists(Directory,\"\") = False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",patternmashine.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_directory),(Object)(RemoteObject.createImmutable(""))),patternmashine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 123;BA.debugLine="File.MakeDir(DirParent,\"PassCon\")";
Debug.ShouldStop(67108864);
patternmashine.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(_dirparent),(Object)(RemoteObject.createImmutable("PassCon")));
 };
 BA.debugLineNum = 126;BA.debugLine="File.WriteMap(Directory, ClearFilename(strPlattfo";
Debug.ShouldStop(536870912);
patternmashine.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(_directory),(Object)(RemoteObject.concat(_clearfilename(patternmashine._strplattformname.runMethod(true,"getText").runMethod(true,"trim")),RemoteObject.createImmutable(".plat"))),(Object)(_savefile));
 BA.debugLineNum = 127;BA.debugLine="frm.Close()";
Debug.ShouldStop(1073741824);
patternmashine._frm.runVoidMethod ("Close");
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
public static RemoteObject  _clearfilename(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ClearFilename (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,72);
if (RapidSub.canDelegate("clearfilename")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","clearfilename", _filename);}
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 72;BA.debugLine="Private Sub ClearFilename(FileName As String) As S";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="FileName = Regex.Replace(\"[\\ \\.]\", FileName, \"_\")";
Debug.ShouldStop(256);
_filename = patternmashine.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[\\ \\.]")),(Object)(_filename),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 74;BA.debugLine="FileName = Regex.Replace(\"[^a-zA-Z0-9_-]\", FileNa";
Debug.ShouldStop(512);
_filename = patternmashine.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^a-zA-Z0-9_-]")),(Object)(_filename),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 75;BA.debugLine="Return FileName";
Debug.ShouldStop(1024);
if (true) return _filename;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatepattern(RemoteObject _basepatternstring,RemoteObject _seed) throws Exception{
try {
		Debug.PushSubsStack("GeneratePattern (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,29);
if (RapidSub.canDelegate("generatepattern")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","generatepattern", _basepatternstring, _seed);}
RemoteObject _unsignednumbers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _value = RemoteObject.createImmutable((byte)0);
RemoteObject _basechars = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _usepattern = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _patterncount = RemoteObject.createImmutable(0);
RemoteObject _bytecount = RemoteObject.createImmutable(0);
RemoteObject _internalcount = RemoteObject.createImmutable(0);
RemoteObject _tempnumber = RemoteObject.createImmutable(0);
int _cnt = 0;
Debug.locals.put("BasePatternString", _basepatternstring);
Debug.locals.put("Seed", _seed);
 BA.debugLineNum = 29;BA.debugLine="Private Sub GeneratePattern(BasePatternString As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Private unsignedNumbers As List";
Debug.ShouldStop(1073741824);
_unsignednumbers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("unsignedNumbers", _unsignednumbers);
 BA.debugLineNum = 32;BA.debugLine="unsignedNumbers.Initialize";
Debug.ShouldStop(-2147483648);
_unsignednumbers.runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="For Each value As Byte In Seed";
Debug.ShouldStop(2);
{
final RemoteObject group3 = _seed;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_value = group3.getArrayElement(true,RemoteObject.createImmutable(index3));Debug.locals.put("value", _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 35;BA.debugLine="unsignedNumbers.Add(ToUnsigned(value))";
Debug.ShouldStop(4);
_unsignednumbers.runVoidMethod ("Add",(Object)((_tounsigned(_value))));
 }
}Debug.locals.put("value", _value);
;
 BA.debugLineNum = 39;BA.debugLine="Private BaseChars As List";
Debug.ShouldStop(64);
_basechars = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("BaseChars", _basechars);
 BA.debugLineNum = 40;BA.debugLine="BaseChars.Initialize";
Debug.ShouldStop(128);
_basechars.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="BaseChars.AddAll(Regex.Split(\"\",BasePatternString";
Debug.ShouldStop(256);
_basechars.runVoidMethod ("AddAll",(Object)(patternmashine.__c.runMethod(false, "ArrayToList", (Object)(patternmashine.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("")),(Object)(_basepatternstring))))));
 BA.debugLineNum = 44;BA.debugLine="Private UsePattern As StringBuilder";
Debug.ShouldStop(2048);
_usepattern = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("UsePattern", _usepattern);
 BA.debugLineNum = 45;BA.debugLine="Private PatternCount = BaseChars.Size - 1 As Int";
Debug.ShouldStop(4096);
_patterncount = RemoteObject.solve(new RemoteObject[] {_basechars.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("PatternCount", _patterncount);Debug.locals.put("PatternCount", _patterncount);
 BA.debugLineNum = 46;BA.debugLine="Private ByteCount = unsignedNumbers.Size - 1 As I";
Debug.ShouldStop(8192);
_bytecount = RemoteObject.solve(new RemoteObject[] {_unsignednumbers.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("ByteCount", _bytecount);Debug.locals.put("ByteCount", _bytecount);
 BA.debugLineNum = 47;BA.debugLine="Private InternalCount = 0 As Int";
Debug.ShouldStop(16384);
_internalcount = BA.numberCast(int.class, 0);Debug.locals.put("InternalCount", _internalcount);Debug.locals.put("InternalCount", _internalcount);
 BA.debugLineNum = 48;BA.debugLine="Private TempNumber As Int";
Debug.ShouldStop(32768);
_tempnumber = RemoteObject.createImmutable(0);Debug.locals.put("TempNumber", _tempnumber);
 BA.debugLineNum = 50;BA.debugLine="UsePattern.Initialize";
Debug.ShouldStop(131072);
_usepattern.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="For cnt = 0 To PatternCount";
Debug.ShouldStop(524288);
{
final int step15 = 1;
final int limit15 = _patterncount.<Integer>get().intValue();
_cnt = 0 ;
for (;(step15 > 0 && _cnt <= limit15) || (step15 < 0 && _cnt >= limit15) ;_cnt = ((int)(0 + _cnt + step15))  ) {
Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 53;BA.debugLine="TempNumber = unsignedNumbers.Get(InternalCount)";
Debug.ShouldStop(1048576);
_tempnumber = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _unsignednumbers.runMethod(false,"Get",(Object)(_internalcount))),(RemoteObject.solve(new RemoteObject[] {_basechars.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "%",0, 0));Debug.locals.put("TempNumber", _tempnumber);
 BA.debugLineNum = 54;BA.debugLine="UsePattern.Append(BaseChars.Get(TempNumber))";
Debug.ShouldStop(2097152);
_usepattern.runVoidMethod ("Append",(Object)(BA.ObjectToString(_basechars.runMethod(false,"Get",(Object)(_tempnumber)))));
 BA.debugLineNum = 55;BA.debugLine="BaseChars.RemoveAt(TempNumber)";
Debug.ShouldStop(4194304);
_basechars.runVoidMethod ("RemoveAt",(Object)(_tempnumber));
 BA.debugLineNum = 56;BA.debugLine="If InternalCount < ByteCount Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",_internalcount,BA.numberCast(double.class, _bytecount))) { 
 BA.debugLineNum = 57;BA.debugLine="InternalCount = InternalCount + 1";
Debug.ShouldStop(16777216);
_internalcount = RemoteObject.solve(new RemoteObject[] {_internalcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("InternalCount", _internalcount);
 }else {
 BA.debugLineNum = 59;BA.debugLine="InternalCount = 0";
Debug.ShouldStop(67108864);
_internalcount = BA.numberCast(int.class, 0);Debug.locals.put("InternalCount", _internalcount);
 };
 }
}Debug.locals.put("cnt", _cnt);
;
 BA.debugLineNum = 62;BA.debugLine="Return UsePattern";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString(_usepattern);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generateseed(RemoteObject _datastring) throws Exception{
try {
		Debug.PushSubsStack("GenerateSeed (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,65);
if (RapidSub.canDelegate("generateseed")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","generateseed", _datastring);}
RemoteObject _seedhash = null;
Debug.locals.put("DataString", _datastring);
 BA.debugLineNum = 65;BA.debugLine="Private Sub GenerateSeed(DataString As String) As";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Private SeedHash() As Byte";
Debug.ShouldStop(2);
_seedhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("SeedHash", _seedhash);
 BA.debugLineNum = 67;BA.debugLine="SeedHash = HashLib.GetMessageDigest(DataString.Ge";
Debug.ShouldStop(4);
_seedhash = patternmashine._hashlib.runMethod(false,"GetMessageDigest",(Object)(_datastring.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("SHA-512")));Debug.locals.put("SeedHash", _seedhash);
 BA.debugLineNum = 68;BA.debugLine="Return SeedHash";
Debug.ShouldStop(8);
if (true) return _seedhash;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _plattformdir() throws Exception{
try {
		Debug.PushSubsStack("PlattformDir (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,131);
if (RapidSub.canDelegate("plattformdir")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","plattformdir");}
 BA.debugLineNum = 131;BA.debugLine="Public Sub PlattformDir() As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("os.name")),(Object)(RemoteObject.createImmutable(""))),BA.ObjectToString("win"))) { 
 BA.debugLineNum = 133;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("\\Documents\\PassCon\\"));
 }else {
 BA.debugLineNum = 135;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("/Documents/PassCon/"));
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _plattformdirparent() throws Exception{
try {
		Debug.PushSubsStack("PlattformDirParent (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,140);
if (RapidSub.canDelegate("plattformdirparent")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","plattformdirparent");}
 BA.debugLineNum = 140;BA.debugLine="Public Sub PlattformDirParent() As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="If GetSystemProperty(\"os.name\",\"\") = \"win\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("os.name")),(Object)(RemoteObject.createImmutable(""))),BA.ObjectToString("win"))) { 
 BA.debugLineNum = 142;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"\\Doc";
Debug.ShouldStop(8192);
if (true) return RemoteObject.concat(patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("\\Documents\\"));
 }else {
 BA.debugLineNum = 144;BA.debugLine="Return GetSystemProperty(\"user.home\",\"\") & \"/Doc";
Debug.ShouldStop(32768);
if (true) return RemoteObject.concat(patternmashine.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("/Documents/"));
 };
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
patternmashine._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
patternmashine._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 5;BA.debugLine="Private XUI As XUI";
patternmashine._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 6;BA.debugLine="Private strPlattformExperience As TextField";
patternmashine._strplattformexperience = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 7;BA.debugLine="Private strPlattformLogin As TextField";
patternmashine._strplattformlogin = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private strPlattformName As TextField";
patternmashine._strplattformname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private strPlattformTarget As TextField";
patternmashine._strplattformtarget = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private HashLib As MessageDigest";
patternmashine._hashlib = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,14);
if (RapidSub.canDelegate("show")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","show");}
 BA.debugLineNum = 14;BA.debugLine="Public Sub Show";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="If frm.IsInitialized = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",patternmashine._frm.runMethod(true,"IsInitialized"),patternmashine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 16;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
Debug.ShouldStop(32768);
patternmashine._frm.runVoidMethod ("Initialize",patternmashine.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 17;BA.debugLine="frm.RootPane.LoadLayout(\"PlattformView\")";
Debug.ShouldStop(65536);
patternmashine._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",patternmashine.ba,(Object)(RemoteObject.createImmutable("PlattformView")));
 BA.debugLineNum = 18;BA.debugLine="frm.Resizable = False";
Debug.ShouldStop(131072);
patternmashine._frm.runMethod(true,"setResizable",patternmashine.__c.getField(true,"False"));
 BA.debugLineNum = 19;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(262144);
patternmashine._frm.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 };
 BA.debugLineNum = 21;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(1048576);
patternmashine._frm.runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tounsigned(RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ToUnsigned (patternmashine) ","patternmashine",1,patternmashine.ba,patternmashine.mostCurrent,25);
if (RapidSub.canDelegate("tounsigned")) { return b4j.example.patternmashine.remoteMe.runUserSub(false, "patternmashine","tounsigned", _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="Public Sub ToUnsigned(b As Byte) As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return Bit.And(0xFF, b)";
Debug.ShouldStop(33554432);
if (true) return patternmashine.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(BA.numberCast(int.class, _b)));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}