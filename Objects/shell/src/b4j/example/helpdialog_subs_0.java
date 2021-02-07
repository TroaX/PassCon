package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class helpdialog_subs_0 {


public static RemoteObject  _openhelp() throws Exception{
try {
		Debug.PushSubsStack("OpenHelp (helpdialog) ","helpdialog",2,helpdialog.ba,helpdialog.mostCurrent,7);
if (RapidSub.canDelegate("openhelp")) { return b4j.example.helpdialog.remoteMe.runUserSub(false, "helpdialog","openhelp");}
 BA.debugLineNum = 7;BA.debugLine="Public Sub OpenHelp";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="If frm.IsInitialized = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",helpdialog._frm.runMethod(true,"IsInitialized"),helpdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 9;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
Debug.ShouldStop(256);
helpdialog._frm.runVoidMethod ("Initialize",helpdialog.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 10;BA.debugLine="frm.RootPane.LoadLayout(\"HelpWindow\")";
Debug.ShouldStop(512);
helpdialog._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",helpdialog.ba,(Object)(RemoteObject.createImmutable("HelpWindow")));
 BA.debugLineNum = 11;BA.debugLine="frm.Resizable = False";
Debug.ShouldStop(1024);
helpdialog._frm.runMethod(true,"setResizable",helpdialog.__c.getField(true,"False"));
 BA.debugLineNum = 12;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(2048);
helpdialog._frm.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 };
 BA.debugLineNum = 14;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(8192);
helpdialog._frm.runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
helpdialog._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
helpdialog._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}