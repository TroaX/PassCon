package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class helpdialog extends Object{
public static helpdialog mostCurrent = new helpdialog();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.helpdialog", null);
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
RDebugUtils.currentModule="helpdialog";
if (Debug.shouldDelegate(ba, "openhelp", false))
	 {return ((String) Debug.delegate(ba, "openhelp", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub OpenHelp";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If frm.IsInitialized = False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="frm.Initialize(\"frm\",-1, -1)";
_frm.Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="frm.RootPane.LoadLayout(\"HelpWindow\")";
_frm.getRootPane().LoadLayout(ba,"HelpWindow");
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="frm.Resizable = False";
_frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="End Sub";
return "";
}
}