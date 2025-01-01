public class overlap_Circle_And_Rectangle {
    public static void main(String args[]){
      checkOverlap(1,0,0,1,1,2,3);
    }
   
        public static boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
             // Find the closest point on the rectangle to the circle's center
            int xClosest = Math.max(x1, Math.min(xCenter, x2));
            int yClosest = Math.max(y1, Math.min(yCenter, y2));
            
            // Calculate the squared distance from the circle's center to the closest point
            int deltaX = xClosest - xCenter;
            int deltaY = yClosest - yCenter;
            int distanceSquared = deltaX * deltaX + deltaY * deltaY;
            
            // Compare squared distance with squared radius
            return distanceSquared <= radius * radius;
        }
  
}