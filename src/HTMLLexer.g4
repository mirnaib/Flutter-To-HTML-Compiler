
lexer grammar  HTMLLexer;
SEA_WS
    :  (' '|'\t'|'\r'? '\n') ->skip
    ;

VOID: SEA_WS*'void'SEA_WS*->pushMode(VOID_MODE);
CLASS:SEA_WS*'class'SEA_WS*->pushMode(CLASS_MODE);
EXTENDS:SEA_WS*'extends'SEA_WS*;
BASE_CLASS:SEA_WS* 'StatelessWidget'|'StatefulWidget' SEA_WS*;
STATE:SEA_WS* 'State' SEA_WS*->pushMode(EXTENDS_MODE);
CLASS_OPEN:SEA_WS*'{'SEA_WS*->pushMode(CLASS_BODY_MODE);
mode VOID_MODE;
MAIN:SEA_WS*'main()'SEA_WS*;
AROW:SEA_WS*'=>'SEA_WS*;
RUNAPP:SEA_WS*'runApp'SEA_WS*;
RUNAPP_OPEN: SEA_WS*'('SEA_WS*->pushMode(RUNAPP_MODE);
VOID_CLOSE: SEA_WS*';'SEA_WS* -> popMode;



mode RUNAPP_MODE;
MAIN_CLASS:SEA_WS* Identifier SEA_WS*->pushMode(MAIN_CLASS_MODE);

RUNAPP_CLOSE
    : SEA_WS*')'SEA_WS* -> popMode
    ;


mode MAIN_CLASS_MODE;
LEFT_BRAKETS:SEA_WS*'('SEA_WS*;

RIGHT_BRAKETS: SEA_WS*')'SEA_WS* -> popMode;


mode CLASS_MODE;
CLASS_NAME:Identifier;
CLASS_NAME_END: ' '-> popMode;




mode EXTENDS_MODE;
STATE_OPEN:SEA_WS* '<' SEA_WS*;
STATE_CLASS:SEA_WS* Identifier SEA_WS*;
STATE_CLOSE: SEA_WS*'>' SEA_WS* -> popMode;


mode CLASS_BODY_MODE;
OVERRIDE:SEA_WS* '@override' SEA_WS*;
STATE_BODY:SEA_WS* 'State' SEA_WS*->pushMode(EXTENDS_MODE);
CREAT_STATE:SEA_WS* 'createState()' SEA_WS*;
STATE_AROW:SEA_WS*'=>'SEA_WS*->pushMode(STATE_MODE);
STATE_SIMI:SEA_WS* ';' SEA_WS*;
WIDGET:SEA_WS* 'Widget' SEA_WS*;
BUILD:SEA_WS* 'build' SEA_WS*;
BUILD_OPEN:SEA_WS* '(' SEA_WS*->pushMode(BUILD_MODE);
BUILD_BODY_OPEN:SEA_WS* '{' SEA_WS*->pushMode(BUILD_BODY_MODE);
CLASS_CLOSE: SEA_WS*'}'SEA_WS* -> popMode;

mode STATE_MODE;
STATE_MAIN_CLASS:SEA_WS* Identifier SEA_WS*;
STATE_MAIN_CLASS_OPEN: SEA_WS* '(' SEA_WS*;
STATE_MAIN_CLASS_CLOSE: SEA_WS* ')' SEA_WS*;
STATE_MAIN_CLASS_SIMI:SEA_WS* ';' SEA_WS* -> popMode;
mode BUILD_MODE;
BUILDCONTEXT:SEA_WS*'BuildContext'->pushMode(BUILDCONTEXT_MODE);
BUILD_CLOSE: SEA_WS*')'SEA_WS* -> popMode;

mode BUILDCONTEXT_MODE;
CONTEXT:SEA_WS* Identifier SEA_WS*-> popMode;

mode BUILD_BODY_MODE;
RETURN:SEA_WS*'return'SEA_WS* ;
MATERIALAPP:SEA_WS*'MaterialApp'SEA_WS* ;
MATERIALAPP_OPEN:SEA_WS*'('->pushMode(MATERIALAPP_MODE);
MATERIAL_SIMI:SEA_WS*';'SEA_WS* ;
BUILD_BODY_CLOSE:SEA_WS* '}' SEA_WS*->popMode;

mode MATERIALAPP_MODE;
HOME:SEA_WS*'home'SEA_WS* ;
DOT:SEA_WS*':'SEA_WS* ->pushMode(HOME_CLASS_MODE);
MATERIALAPP_CLOSE:SEA_WS* ')' SEA_WS*->popMode;

mode HOME_CLASS_MODE;
HOME_CLASS:SEA_WS* Identifier SEA_WS* ;
HOME_CLASS_OPEN:SEA_WS* '(' SEA_WS*->pushMode(BODY_MODE);
//HOME_CLASS_CLOSE:SEA_WS* ')';
HOME_CLASS_END:SEA_WS* ',' SEA_WS*->popMode;


mode BODY_MODE;
BODY:SEA_WS* 'body' SEA_WS*;
BODY_DOT:SEA_WS* ':' SEA_WS*;
COLUMN:SEA_WS* 'Column' SEA_WS*;
ROW:SEA_WS* 'Row' SEA_WS*;
BODY_END:SEA_WS* ',' SEA_WS*;
COLUMN_ROW_OPEN:SEA_WS* '(' SEA_WS*->pushMode(COLUMN_ROW_MODE);
HOME_CLASS_CLOSE:SEA_WS* ')'->popMode;

mode COLUMN_ROW_MODE;
CHILDREN:SEA_WS* 'children' SEA_WS*;
CHILDREN_DOT:SEA_WS* ':' SEA_WS*;
CHILDREN_OPEN:SEA_WS* '[' SEA_WS*->pushMode(CHILDREN_MODE);
CHILDREN_END:SEA_WS* ',' SEA_WS*;
COLUMN_ROW_CLOSE:SEA_WS* ')' SEA_WS*->popMode;


mode CHILDREN_MODE;
STACK:SEA_WS* 'Stack' SEA_WS*->pushMode(CHILDREN_MODE);
CONTAINER:SEA_WS* 'Container' SEA_WS*->pushMode(CONTAINER_MODE);
CHILD_OPEN:SEA_WS* '(' SEA_WS*;
NESTED_CHILDREN:SEA_WS* 'children' SEA_WS*->pushMode(NESTED_CHILDREN_MODE);
CHILD_CLOSE:SEA_WS* ')' SEA_WS*->popMode;
CHILD_END:SEA_WS* ',' SEA_WS*;
CHILDREN_CLOSE:SEA_WS* ']' SEA_WS*->popMode;

mode NESTED_CHILDREN_MODE;
NESTED_CHILDREN_DOT:SEA_WS* ':' SEA_WS*;
NESTED_CHILDREN_OPEN:SEA_WS* '[' SEA_WS*->pushMode(NESTED_CHILDREN_BODY_MODE);
NESTED_CHILDREN_END:SEA_WS* ',' SEA_WS*->popMode;

mode NESTED_CHILDREN_BODY_MODE;
NESTED_CONTAINER:SEA_WS* 'Container' SEA_WS*->pushMode(CONTAINER_MODE);
NESTED_CONTAINER_END:SEA_WS* ',' SEA_WS*;
NESTED_CHILDREN_CLOSE:SEA_WS* ']' SEA_WS*->popMode;

mode CONTAINER_MODE;
CONTAINER_OPEN:SEA_WS* '(' SEA_WS*->pushMode(CONTAINER_OPEN_MODE);
CONTAINER_CHILD_END:SEA_WS* ',' SEA_WS*->popMode;

mode CONTAINER_OPEN_MODE;
CHILD:SEA_WS* 'child' SEA_WS*;
CHILD_DOT:SEA_WS* ':' SEA_WS*;
ATTRIBUT:SEA_WS* 'Image'|'Text' SEA_WS*;
SINGLE_DOT:SEA_WS* '.' SEA_WS*;
FLOATINGACTIONBUTTON:SEA_WS* 'FloatingActionButton' SEA_WS*->pushMode(BUTTON_MODE);
NETWOEK:SEA_WS* 'network' SEA_WS*;
ATTRIBUT_OPEN:SEA_WS* '(' SEA_WS*->pushMode(IMAGE_MODE);
ATTRIBUT_END:SEA_WS* ',' SEA_WS*;
CONTAINER_CLOSE:SEA_WS* ')' SEA_WS*->popMode;


mode IMAGE_MODE;
ATTRIBUT_DESCRIPTION:SEA_WS* Express SEA_WS*;
ATTRIBUT_CLOSE:SEA_WS* ')' SEA_WS*->popMode;

mode BUTTON_MODE;
BUTTON_OPEN:SEA_WS* '(' SEA_WS*;
ONPRESSED:SEA_WS* 'onPressed' SEA_WS*->pushMode(ONPRESSED_MODE);
ONPRESSED_BODY_OPEN:SEA_WS* '{' SEA_WS*->pushMode(ONPRESSED_BODY_MODE);
BUTTON_CLOSE:SEA_WS* ')' SEA_WS*->popMode;


mode ONPRESSED_MODE;
ONPRESSED_DOT:SEA_WS* ':' SEA_WS*;
ONPRESSED_OPEN:SEA_WS* '(' SEA_WS*;
ONPRESSED_CLOSE:SEA_WS* ')' SEA_WS*->popMode;

mode ONPRESSED_BODY_MODE;
NAVIGATOR:SEA_WS* 'Navigator' SEA_WS*;
NAVIGATOR_DOT:SEA_WS* '.' SEA_WS*;
PUSH:SEA_WS* 'push' SEA_WS*;
PUSH_OPEN:SEA_WS* '(' SEA_WS*->pushMode(PUSH_MODE);
NAVIGATOR_SIMI:SEA_WS* ';' SEA_WS*;
ONPRESSED_BODY_CLOSE:SEA_WS* '}' SEA_WS*->popMode;

mode PUSH_MODE;
NAVIGATOR_CONTEXT:SEA_WS* Identifier SEA_WS*;
NAVIGATOR_CONTEXT_SIMI:SEA_WS* ',' SEA_WS*->pushMode(NAVIGATOR_CONTEXT_MODE);
PUSH_CLOSE:SEA_WS* ')' SEA_WS*->popMode;

mode NAVIGATOR_CONTEXT_MODE;
MATERIALPAGEROUTE:SEA_WS* 'MaterialPageRoute' SEA_WS*;
MATERIALPAGEROUTE_OPEN:SEA_WS* '(' SEA_WS*;
BUILDER:SEA_WS* 'builder' SEA_WS*;
BUILDER_DOT:SEA_WS* ':' SEA_WS*->pushMode(BUILDER_MODE);
MATERIALPAGEROUTE_BODY_OPEN:SEA_WS* '{' SEA_WS*->pushMode(MATERIALPAGEROUTE_BODY_MODE);
MATERIALPAGEROUTE_CLOSE:SEA_WS* ')' SEA_WS*;
NAVIGATOR_CONTEXT_END:SEA_WS* ',' SEA_WS*->popMode;

mode BUILDER_MODE;
BUILDER_OPEN:SEA_WS* '(' SEA_WS*;
BUILDER_BUILDCONTEXT:SEA_WS*'BuildContext'->pushMode(BUILDER_BUILDCONTEXT_MODE);
BUILDER_CLOSE:SEA_WS* ')' SEA_WS*->popMode;

mode BUILDER_BUILDCONTEXT_MODE;
BUILDER_CONTEXT:SEA_WS* Identifier SEA_WS*-> popMode;



mode MATERIALPAGEROUTE_BODY_MODE;
MATERIALPAGEROUTE_RETURN:SEA_WS* 'return' SEA_WS*->pushMode(ROUT_TARGET_CLASS_MODE);
MATERIALPAGEROUTE_BODY_CLOSE: SEA_WS*'}'SEA_WS* -> popMode;




mode ROUT_TARGET_CLASS_MODE;
TARGET_CLASS:SEA_WS* Identifier SEA_WS*;
TARGET_CLASS_OPEN:SEA_WS* '(' SEA_WS*;
TARGET_CLASS_CLOSE:SEA_WS* ')' SEA_WS*;
MATERIALPAGEROUTE_RETURN_SIMI:SEA_WS* ';' SEA_WS*->popMode;

fragment
PAGE_NameChar
    : PAGE_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;
fragment
DIGIT
    : [0-9]
    ;

fragment
PAGE_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

fragment
Identifier
    :   ('_'|'.'|'/'|':'|'"'|'\''|Letter|JavaIDDigit|PAGE_NameChar )+;

fragment
Express:(' '|'_'|'.'|'/'|':'|'"'|'\''|','|Letter|JavaIDDigit|PAGE_NameChar )+;
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;
WHITESPACE1
    : [ \t\r\n] -> channel(HIDDEN)
    ;