'use strict';
import * as $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6 from "./internal-3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.js";
import * as $j_livechart$002e$002dData$002dItem from "./livechart.-Data-Item.js";
import * as $j_livechart$002e$002dModel from "./livechart.-Model.js";
function $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V($thiz, event) {
  var domList = document.getElementsByClassName("selectedCell");
  var this$3 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lorg_scalajs_dom_DOMList$DOMListSeq(domList);
  var f = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((element) => {
    element.classList.remove("selectedCell")
  }));
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_sc_IterableOps__map__F1__O(this$3, f);
  event.target.className = "selectedCell";
  var x = event.target.innerText;
  var this$5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_Console$();
  var this$6 = this$5.out__Ljava_io_PrintStream();
  this$6.java$lang$JSConsoleBasedPrintStream$$printString__T__V((x + "\n"))
}
export { $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V as $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V };
/** @constructor */
function $c_Llivechart_LiveChart$package$() {
  this.Llivechart_LiveChart$package$__f_model = null;
  $n_Llivechart_LiveChart$package$ = this;
  this.Llivechart_LiveChart$package$__f_model = new $j_livechart$002e$002dModel.$c_Llivechart_Model()
}
export { $c_Llivechart_LiveChart$package$ as $c_Llivechart_LiveChart$package$ };
$c_Llivechart_LiveChart$package$.prototype = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$h_O();
$c_Llivechart_LiveChart$package$.prototype.constructor = $c_Llivechart_LiveChart$package$;
/** @constructor */
function $h_Llivechart_LiveChart$package$() {
  /*<skip>*/
}
export { $h_Llivechart_LiveChart$package$ as $h_Llivechart_LiveChart$package$ };
$h_Llivechart_LiveChart$package$.prototype = $c_Llivechart_LiveChart$package$.prototype;
$c_Llivechart_LiveChart$package$.prototype.LiveChart__V = (function() {
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_package$();
  var elems = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_T.getArrayOf().constr)(["\ud83c\udf89", "\ud83d\ude80", "\ud83c\udf49"]));
  var allowedIcons = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(elems);
  var iconVar = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.Lcom_raquo_laminar_api_package$$anon$1__f_Var.apply__O__Lcom_raquo_airstream_state_Var(allowedIcons.head__O());
  var this$15 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var container = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction0((() => document.body));
  var rootNode = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction0((() => {
    var $x_25 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag();
    var $x_24 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    var $x_23 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.width__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("100%");
    var $x_22 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag();
    var $x_21 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    var $x_20 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.display__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("flex");
    var $x_19 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.marginBottom__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("2rem");
    var $x_18 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.justifyContent__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("space-around");
    var $x_17 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.select__Lcom_raquo_laminar_tags_HtmlTag();
    var $x_16 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
    var eventProp = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onChange__Lcom_raquo_laminar_keys_EventProp();
    var this$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp, false, false).mapToValue__Lcom_raquo_laminar_keys_EventProcessor();
    var sink = iconVar.Lcom_raquo_airstream_state_SourceVar__f_writer;
    var onNext = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((_$1) => {
      sink.onNext__O__V(_$1)
    }));
    var $x_15 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$4, onNext);
    var $x_14 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.value__Lcom_raquo_laminar_keys_HtmlProp().$less$minus$minus__Lcom_raquo_airstream_core_Source__Lcom_raquo_laminar_modifiers_KeyUpdater(iconVar.Lcom_raquo_airstream_state_SourceVar__f_signal);
    var this$7 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
    var f = ((icon) => {
      var icon$1 = icon;
      var $x_13 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.option__Lcom_raquo_laminar_tags_HtmlTag();
      var $x_12 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
      var this$5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.value__Lcom_raquo_laminar_keys_HtmlProp();
      var $x_11 = this$5.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(icon$1);
      var this$6 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
      var renderable = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
      return $x_13.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_12.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_11, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$6, icon$1, renderable)])))
    });
    if ((allowedIcons === $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
      var nodes = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$()
    } else {
      var arg1 = allowedIcons.head__O();
      var h = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f(arg1), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
      var t = h;
      var rest = allowedIcons.tail__O();
      while ((rest !== $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
        var arg1$1 = rest.head__O();
        var nx = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f(arg1$1), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
        t.sci_$colon$colon__f_next = nx;
        t = nx;
        rest = rest.tail__O()
      };
      var nodes = h
    };
    var $x_10 = $x_17.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_16.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_15, $x_14, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__nodeSeqToModifier__sc_Seq__Lcom_raquo_laminar_modifiers_Modifier(this$7, nodes)])));
    var $x_9 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.button__Lcom_raquo_laminar_tags_HtmlTag();
    var $x_8 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    var $x_7 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tpe__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("button");
    var this$8 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
    var renderable$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
    var $x_6 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$8, "Click me!", renderable$1);
    $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
    var eventProp$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
    var this$13 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$1, false, false);
    var onNext$1 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event) => {
      var this$11 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_Console$();
      var this$12 = this$11.out__Ljava_io_PrintStream();
      this$12.java$lang$JSConsoleBasedPrintStream$$printString__T__V("Clicked\n")
    }));
    var $x_5 = $x_9.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_8.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_7, $x_6, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$13, onNext$1)])));
    var $x_4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.input__Lcom_raquo_laminar_tags_HtmlTag();
    var $x_3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    var $x_2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.padding__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("10px");
    var $x_1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.width__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(" 25rem");
    var this$14 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.placeholder__Lcom_raquo_laminar_keys_HtmlProp();
    return $x_25.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_24.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_23, $x_22.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_21.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_20, $x_19, $x_18, $x_10, $x_5, $x_4.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_3.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_2, $x_1, this$14.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("Search")])))]))), $m_Llivechart_LiveChart$package$().renderDataTable__Lcom_raquo_laminar_nodes_ReactiveElement()])))
  }));
  var arg1$2 = this$15.Lcom_raquo_laminar_api_package$$anon$1__f_documentEventProps;
  var eventProp$2 = arg1$2.onDomContentLoaded__Lcom_raquo_laminar_keys_EventProp();
  var p = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$2, false, false);
  var this$19 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_airstream_web_DomEventStream$().apply__Lorg_scalajs_dom_EventTarget__T__Z__Lcom_raquo_airstream_core_EventStream(document, p.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp.Lcom_raquo_laminar_keys_EventProp__f_name, p.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture);
  var fn = p.Lcom_raquo_laminar_keys_EventProcessor__f_processor;
  var this$20 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_airstream_misc_CollectStream(this$19, fn);
  var onNext$2 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((_$2) => {
    new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_nodes_RootNode(container.apply__O(), rootNode.apply__O())
  }));
  var owner = this$15.unsafeWindowOwner__Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$();
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(this$20, onNext$2, owner);
  document.addEventListener("keydown", ((event$1) => {
    var domList = document.getElementsByClassName("selectedCell");
    var this$22 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lorg_scalajs_dom_DOMList$DOMListSeq(domList);
    var this$23 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_sc_IterableOps__headOption__s_Option(this$22);
    if (this$23.isEmpty__Z()) {
      var selectedCell = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_None$()
    } else {
      var arg1$3 = this$23.get__O();
      var selectedCell = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_s_Some(arg1$3)
    };
    var x5 = selectedCell;
    var x = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_None$();
    if ((x === x5)) {
      return null
    };
    if ((x5 instanceof $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_s_Some)) {
      var cell = x5.s_Some__f_value;
      if ((event$1.key === "ArrowDown")) {
        var rowIndex = (cell.parentElement.rowIndex | 0);
        var cellIndex = (cell.cellIndex | 0);
        if ((rowIndex < (((-2) + (document.getElementById("myTable").rows.length | 0)) | 0))) {
          cell.classList.remove("selectedCell");
          document.getElementById("myTable").rows[((1 + rowIndex) | 0)].cells[cellIndex].classList.add("selectedCell")
        }
      };
      if ((event$1.key === "ArrowUp")) {
        var rowIndex$2 = (cell.parentElement.rowIndex | 0);
        var cellIndex$2 = (cell.cellIndex | 0);
        if ((rowIndex$2 > 1)) {
          cell.classList.remove("selectedCell");
          document.getElementById("myTable").rows[(((-1) + rowIndex$2) | 0)].cells[cellIndex$2].classList.add("selectedCell")
        }
      };
      if ((event$1.key === "ArrowLeft")) {
        var rowIndex$3 = (cell.parentElement.rowIndex | 0);
        var cellIndex$3 = (cell.cellIndex | 0);
        if ((cellIndex$3 >= 1)) {
          cell.classList.remove("selectedCell");
          document.getElementById("myTable").rows[rowIndex$3].cells[(((-1) + cellIndex$3) | 0)].classList.add("selectedCell")
        }
      };
      if ((event$1.key === "ArrowRight")) {
        var rowIndex$4 = (cell.parentElement.rowIndex | 0);
        var cellIndex$4 = (cell.cellIndex | 0);
        return ((cellIndex$4 < (((-1) + (document.getElementById("myTable").rows[rowIndex$4].cells.length | 0)) | 0)) ? (cell.classList.remove("selectedCell"), document.getElementById("myTable").rows[rowIndex$4].cells[((1 + cellIndex$4) | 0)].classList.add("selectedCell"), (void 0)) : (void 0))
      } else {
        return (void 0)
      }
    };
    throw new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_s_MatchError(x5)
  }))
});
$c_Llivechart_LiveChart$package$.prototype.renderDataTable__Lcom_raquo_laminar_nodes_ReactiveElement = (function() {
  var $x_42 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.table__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_41 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_40 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.idAttr__Lcom_raquo_laminar_keys_HtmlProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("myTable");
  var $x_39 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.width__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("100%");
  var $x_38 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.thead__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_37 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_36 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.border__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("1px solid grey");
  var $x_35 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tr__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_34 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_33 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.th__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_32 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_31 = $x_33.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_32.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$1, "Label", renderable)])));
  var $x_30 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.th__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_29 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_28 = $x_30.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_29.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$2, "Price", renderable$1)])));
  var $x_27 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.th__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_26 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_25 = $x_27.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_26.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$3, "Count", renderable$2)])));
  var $x_24 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.th__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_23 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_22 = $x_24.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_23.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$4, "Full price", renderable$3)])));
  var $x_21 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.th__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_20 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_19 = $x_38.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_37.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_36, $x_35.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_34.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_31, $x_28, $x_25, $x_22, $x_21.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_20.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$5, "Action", renderable$4)])))])))])));
  var $x_18 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tbody__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_17 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var this$7 = $m_Llivechart_LiveChart$package$().Llivechart_LiveChart$package$__f_model.Llivechart_Model__f_dataSignal;
  var project = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((data) => {
    var data$1 = data;
    var f = ((item) => {
      var item$1 = item;
      return $m_Llivechart_LiveChart$package$().renderDataItem__Llivechart_DataItemID__Llivechart_DataItem__Lcom_raquo_laminar_nodes_ReactiveElement(item$1.Llivechart_DataItem__f_id, item$1)
    });
    if ((data$1 === $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
      return $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$()
    } else {
      var arg1 = data$1.head__O();
      var h = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f(arg1), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
      var t = h;
      var rest = data$1.tail__O();
      while ((rest !== $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
        var arg1$1 = rest.head__O();
        var nx = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f(arg1$1), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
        t.sci_$colon$colon__f_next = nx;
        t = nx;
        rest = rest.tail__O()
      };
      return h
    }
  }));
  var childrenSource = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_airstream_misc_MapSignal(this$7, project, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_None$());
  var $x_16 = $x_18.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_17.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_ChildrenInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter(childrenSource, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableNode$().Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable)])));
  var $x_15 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tfoot__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_14 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_13 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tr__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_12 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_11 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_10 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_9 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.button__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_8 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$9 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_7 = $x_11.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_10.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_9.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_8.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$9, "\u2795", renderable$5)])))])));
  var $x_6 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag().apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([])));
  var $x_5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag().apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([])));
  var $x_4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var this$12 = $m_Llivechart_LiveChart$package$().Llivechart_LiveChart$package$__f_model.Llivechart_Model__f_dataSignal;
  var project$1 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((data$2) => {
    var data$3 = data$2;
    var $x_2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sc_StringOps$();
    var $x_1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
    var f$1 = ((_$2) => {
      var _$2$1 = _$2;
      return _$2$1.fullPrice__D()
    });
    if ((data$3 === $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
      var this$11 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$()
    } else {
      var arg1$2 = data$3.head__O();
      var h$1 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f$1(arg1$2), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
      var t$1 = h$1;
      var rest$1 = data$3.tail__O();
      while ((rest$1 !== $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$())) {
        var arg1$3 = rest$1.head__O();
        var nx$1 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sci_$colon$colon(f$1(arg1$3), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sci_Nil$());
        t$1.sci_$colon$colon__f_next = nx$1;
        t$1 = nx$1;
        rest$1 = rest$1.tail__O()
      };
      var this$11 = h$1
    };
    var num = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_math_Numeric$DoubleIsFractional$();
    return $x_2.format$extension__T__sci_Seq__T("%.2f", $x_1.genericWrapArray__O__sci_ArraySeq(new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$ac_O([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_sc_IterableOnceOps__sum__s_math_Numeric__O(this$11, num)])))
  }));
  var textSource = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_airstream_misc_MapSignal(this$12, project$1, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_s_None$());
  return $x_42.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_41.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_40, $x_39, $x_19, $x_16, $x_15.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_14.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_13.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_12.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_7, $x_6, $x_5, $x_4.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_3.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_ChildTextInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_modifiers_Inserter(textSource, $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable)]))), $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag().apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([])))])))])))])))
});
$c_Llivechart_LiveChart$package$.prototype.renderDataItem__Llivechart_DataItemID__Llivechart_DataItem__Lcom_raquo_laminar_nodes_ReactiveElement = (function(id, item) {
  var $x_23 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.tr__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_22 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_21 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_20 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var value = item.Llivechart_DataItem__f_label;
  var renderable = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_19 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$1, value, renderable);
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var eventProp = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
  var this$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp, false, false);
  var onNext = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event) => {
    $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V(this, event)
  }));
  var $x_18 = $x_21.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_20.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_19, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$4, onNext)])));
  var $x_17 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_16 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var value$1 = item.Llivechart_DataItem__f_price;
  var renderable$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_doubleRenderable;
  var $x_15 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$5, value$1, renderable$1);
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var eventProp$1 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
  var this$7 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$1, false, false);
  var onNext$1 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event$2) => {
    $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V(this, event$2)
  }));
  var $x_14 = $x_17.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_16.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_15, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$7, onNext$1)])));
  var $x_13 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_12 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$8 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var value$2 = item.Llivechart_DataItem__f_count;
  var renderable$2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_intRenderable;
  var $x_11 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$8, value$2, renderable$2);
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var eventProp$2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
  var this$10 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$2, false, false);
  var onNext$2 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event$3) => {
    $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V(this, event$3)
  }));
  var $x_10 = $x_13.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_12.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_11, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$10, onNext$2)])));
  var $x_9 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_8 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$12 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var value$3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sc_StringOps$().format$extension__T__sci_Seq__T("%.2f", $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$().genericWrapArray__O__sci_ArraySeq(new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$ac_O([item.fullPrice__D()])));
  var renderable$3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_7 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$12, value$3, renderable$3);
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var eventProp$3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
  var this$14 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$3, false, false);
  var onNext$3 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event$4) => {
    $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V(this, event$4)
  }));
  var $x_6 = $x_9.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_8.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_7, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$14, onNext$3)])));
  var $x_5 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.td__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var $x_3 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.button__Lcom_raquo_laminar_tags_HtmlTag();
  var $x_2 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_sr_ScalaRunTime$();
  var this$15 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  var $x_1 = $x_3.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_2.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$15, "\ud83d\uddd1\ufe0f", renderable$4)])));
  $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$();
  var eventProp$4 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onClick__Lcom_raquo_laminar_keys_EventProp();
  var this$17 = $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$4, false, false);
  var onNext$4 = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_sjsr_AnonFunction1(((event$5) => {
    $p_Llivechart_LiveChart$package$__handleCellClick$1__Lorg_scalajs_dom_MouseEvent__V(this, event$5)
  }));
  return $x_23.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_22.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_18, $x_14, $x_10, $x_6, $x_5.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_4.wrapRefArray__AO__sci_ArraySeq(new ($j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$x_1, new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$c_Lcom_raquo_laminar_modifiers_EventListener(this$17, onNext$4)])))])))
});
var $d_Llivechart_LiveChart$package$ = new $j_internal$002d3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.$TypeData().initClass({
  Llivechart_LiveChart$package$: 0
}, false, "livechart.LiveChart$package$", {
  Llivechart_LiveChart$package$: 1,
  O: 1
});
export { $d_Llivechart_LiveChart$package$ as $d_Llivechart_LiveChart$package$ };
$c_Llivechart_LiveChart$package$.prototype.$classData = $d_Llivechart_LiveChart$package$;
var $n_Llivechart_LiveChart$package$;
function $m_Llivechart_LiveChart$package$() {
  if ((!$n_Llivechart_LiveChart$package$)) {
    $n_Llivechart_LiveChart$package$ = new $c_Llivechart_LiveChart$package$()
  };
  return $n_Llivechart_LiveChart$package$
}
export { $m_Llivechart_LiveChart$package$ as $m_Llivechart_LiveChart$package$ };
//# sourceMappingURL=livechart.-Live-Chart$package$.js.map
