package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class b4xcollections extends Object{
public static b4xcollections mostCurrent = new b4xcollections();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xcollections", null);
		ba.loadHtSubs(b4xcollections.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.b4xcollections", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xcollections.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.patternmashine _patternmashine = null;
public static b4j.example.helpdialog _helpdialog = null;
public static b4j.example.b4xbitset  _createbitset(int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createbitset", true))
	 {return ((b4j.example.b4xbitset) Debug.delegate(ba, "createbitset", new Object[] {_size}));}
b4j.example.b4xbitset _s = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.example.b4xbitset();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim s As B4XSet";
_s = new b4j.example.b4xset();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="End Sub";
return null;
}
}