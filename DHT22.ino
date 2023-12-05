#include "DHT.h"
#define DHTPIN 2
#define DHTTYPE DHT22

DHT dht (DHTPIN, DHTTYPE);

void setup() {
Serial.begin(9600);
dht.begin();
}

void loop() {
delay(2000);

float h = dht.readHumidity();
float t = dht.readTemperature();

if (isnan(h) || isnan(t)){
  Serial.println("Fallo de lectura");
  return;
}

Serial.print(t);
Serial.println(" C");
Serial.print(h);
Serial.println(" %");

}
