#include "protothreads.h"
float _buttonState = 0;
float _switch = 0;
#define _BUTTON_PIN 12
#define _LED1_PIN 10
#define _LED2_PIN 11
pt pt0;
int pt0thread(struct pt *pt) { 
 PT_BEGIN(pt);
 for(;;){ 
if(_switch == 0 ){digitalWrite(_LED1_PIN, HIGH);_switch = 1;} else {digitalWrite(_LED1_PIN, LOW);_switch = 0;}
PT_SLEEP(pt, 1000);

}
PT_END(pt);
}float _blinkLED(float _buttonState){if(_buttonState == 1 ){digitalWrite(_LED2_PIN, HIGH);} else {digitalWrite(_LED2_PIN, LOW);}}pt pt1;
int pt1thread(struct pt *pt) { 
 PT_BEGIN(pt);
 for(;;){ 
_buttonState = digitalRead(_BUTTON_PIN);_blinkLED(_buttonState);PT_YIELD(pt);
}
PT_END(pt);
}

void setup(){
Serial.begin(9600);
pinMode(_BUTTON_PIN, INPUT);
pinMode(_LED1_PIN, OUTPUT);
pinMode(_LED2_PIN, OUTPUT);
PT_INIT(&pt0);PT_INIT(&pt1);}

void loop(){
PT_SCHEDULE(pt0thread(&pt0));PT_SCHEDULE(pt1thread(&pt1));}

