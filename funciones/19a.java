void setup() {
  size(400, 400);  // Tamaño de la ventana
  background(255);  // Color de fondo blanco
  drawHouse(width/2, height/2);  // Llama a la función drawHouse() centrada en el medio de la ventana
}

void draw() {
  // No necesitamos hacer nada aquí porque todo se ha dibujado en setup()
}

void drawHouse(float x, float y) {
  // Tamaño de la casa
  float houseWidth = 100;
  float houseHeight = 100;
  
  // Dibuja el rectángulo principal de la casa
  fill(255, 0, 0);  // Color rojo para la casa
  rectMode(CENTER);
  rect(x, y, houseWidth, houseHeight);
  
  // Dibuja el techo de la casa
  fill(0, 255, 0);  // Color verde para el techo
  triangle(x - houseWidth/2, y - houseHeight/2,  // Esquina superior izquierda
           x + houseWidth/2, y - houseHeight/2,  // Esquina superior derecha
           x, y - houseHeight);                  // Esquina superior del triángulo
  
  // Dibuja la puerta
  fill(0);  // Color negro para la puerta
  rect(x, y + houseHeight/4, houseWidth/4, houseHeight/2);
  
  // Dibuja la ventana
  fill(255);  // Color blanco para la ventana
  rect(x - houseWidth/4, y - houseHeight/4, houseWidth/4, houseHeight/4);
}