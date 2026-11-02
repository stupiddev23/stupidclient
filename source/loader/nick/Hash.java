package nick;

public class Hash {
   private static long hash(byte[] data, int n) {
      return data[n] & 255L
         | (data[n + 1] & 255L) << 8
         | (data[n + 2] & 255L) << 16
         | (data[n + 3] & 255L) << 24
         | (data[n + 4] & 255L) << 32
         | (data[n + 5] & 255L) << 40
         | (data[n + 6] & 255L) << 48
         | (data[n + 7] & 255L) << 56;
   }

   public static long hash(byte[] data, int n, int n2) {
      long l = n2 & 4294967295L ^ n * -4132994306676758123L;
      int n4 = n >> 3;

      for (int n3 = 0; n3 < n4; n3++) {
         int n5 = n3 << 3;
         long l2 = hash(data, n5);
         l2 *= -4132994306676758123L;
         l2 ^= l2 >>> 47;
         l ^= l2 * -4132994306676758123L;
         l *= -4132994306676758123L;
      }

      int var10 = n4 << 3;
      switch (n - var10) {
         case 7:
            l ^= (data[var10 + 6] & 255L) << 48;
         case 6:
            l ^= (data[var10 + 5] & 255L) << 40;
         case 5:
            l ^= (data[var10 + 4] & 255L) << 32;
         case 4:
            l ^= (data[var10 + 3] & 255L) << 24;
         case 3:
            l ^= (data[var10 + 2] & 255L) << 16;
         case 2:
            l ^= (data[var10 + 1] & 255L) << 8;
         case 1:
            l ^= data[var10] & 255L;
            l *= -4132994306676758123L;
         default:
            l ^= l >>> 47;
            l *= -4132994306676758123L;
            return l ^ l >>> 47;
      }
   }

   public static long hash(byte[] data) {
      return hash(data, data.length, -512093083);
   }
}
