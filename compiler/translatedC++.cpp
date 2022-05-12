#include "protothreads.h"
float _buttonState = 0;
float _switch = 0;
#define _BUTTON_PIN 12
#define _LED_PIN 11
float _b = 5;
float _a = {1, 2, 3, 4};
float _l = 0;
pt pt0;
int pt0thread(struct pt *pt) { 
 PT_BEGIN(pt);
 for(;;){ 
if(_switch != 0 ){digitalWrite(LED_BUILTIN, HIGH);_switch = 1;} else {digitalWrite(LED_BUILTIN, LOW);_switch = 0;}
PT_SLEEP(pt, 1000);

}
PT_END(pt);
}float _blinkLED(float _buttonState){if(_buttonState != 1 ){digitalWrite(_LED_PIN, LOW);} else {digitalWrite(_LED_PIN, HIGH);}for(float i : a){_l = 1;}}pt pt1;
int pt1thread(struct pt *pt) { 
 PT_BEGIN(pt);
 for(;;){ 
_buttonState = digitalRead(_BUTTON_PIN);_blinkLED(_buttonState);
}
PT_END(pt);
}

void setup(){
Serial.begin(9600);
pinMode(_BUTTON_PIN, INPUT);
pinMode(_LED_PIN, OUTPUT);
PT_INIT(&pt0);PT_INIT(&pt1);}

void loop(){
PT_SCHEDULE(pt0thread(&pt0));PT_SCHEDULE(pt1thread(&pt1));}

