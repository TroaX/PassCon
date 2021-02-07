package b4j.example;


import anywheresoftware.b4a.BA;

public class helpdialog extends Object{
public static helpdialog mostCurrent = new helpdialog();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.helpdialog", null);
		ba.loadHtSubs(helpdialog.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.helpdialog", ba);
		}
	}
    public static Class<?> getObject() {
		return helpdialog.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.main _main = null;
public static b4j.example.patternmashine _patternmashine = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _openhelp() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub OpenHelp";
 //BA.debugLineNum = 8;BA.debugLine="If frm.IsInitialized = False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 9;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
_frm.Initialize(ba,"frm",-1,-1);
 //BA.debugLineNum = 10;BA.debugLine="frm.RootPane.LoadLayout(\"HelpWindow\")";
_frm.getRootPane().LoadLayout(ba,"HelpWindow");
 //BA.debugLineNum = 11;BA.debugLine="frm.Resizable = False";
_frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 12;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 };
 //BA.debugLineNum = 14;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
