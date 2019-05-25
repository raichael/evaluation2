public class PaintJob {
    public static void main(String[] args){
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(6.26,2.2));
       }
        public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets) {
              if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets > 0) {
                double area = width * height;
                double totalbucket = areaPerBucket * extraBuckets;
                double bucket = area - totalbucket;
                double paintarea = bucket / areaPerBucket;
                if (paintarea <= 0) {
                    return 0;
                } else {
                    return (int) Math.ceil(paintarea);
                }
            }
            return -1;

        }
        public static int getBucketCount(double width,double height,double areaPerBucket){
               if( width >0 && height>0 &&areaPerBucket>0)
               {
                   double area=width*height;
                   double paintarea=area/areaPerBucket;
                   return (int) Math.ceil(paintarea);
               }
               return  -1;
    }
        public static int getBucketCount(double area,double areaPerBucket){
               if(area>0 && areaPerBucket>0)
        {
            double paintarea=area/areaPerBucket;
            return(int) Math.ceil(paintarea);
        }
        return -1;
    }
}
