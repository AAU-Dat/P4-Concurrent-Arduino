#include "protothreads.h"
#define _LED_PIN 11
#define _BUTTON_PIN 12
float _buttonState = 0;
bool _ledState = HIGH;
pt pt0;
int pt0thread(struct pt *pt)
{
    PT_BEGIN(pt);
    for (;;)
    {
        _ledState = !_ledState;
        digitalWrite(LED_BUILTIN, _ledState);
        PT_SLEEP(pt, 1000);
    }
    PT_END(pt);
}
float _blinkLED(float _buttonState)
{
    if (_buttonState == 1)
    {
        digitalWrite(_LED_PIN, HIGH);
    }
    else
    {
        digitalWrite(_LED_PIN, LOW);
    }
}
pt pt1;
int pt1thread(struct pt *pt)
{
    PT_BEGIN(pt);
    for (;;)
    {
        _buttonState = digitalRead(_BUTTON_PIN);
        _blinkLED();
    }
    PT_END(pt);
}

void setup()
{
    Serial.begin(9600);
    pinMode(_LED_PIN, OUTPUT);
    pinMode(_BUTTON_PIN, OUTPUT);
    PT_INIT(&pt0);
    PT_INIT(&pt1);
}

void loop()
{
    PT_SCHEDULE(pt0thread(&pt0));
    PT_SCHEDULE(pt1thread(&pt1));
}
