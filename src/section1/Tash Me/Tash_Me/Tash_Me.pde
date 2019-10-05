PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend.jpg");
size(600, 600);
friend.resize(width, height);
mustache = loadImage("tash.png");

}

void draw() {
  background(friend);
  image(mustache, mouseX, mouseY);
   

}
