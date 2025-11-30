public class HashTab{
    private String[][] bucket; private long capacity = 255; private boolean[] erased;

    private int hashtabHash(String key){
        long hashCode = 0;
        for (int i = 0; i < key.length(); i++){
            hashCode += (int) key.charAt(i);
        }
        return (int) hashCode % 255;
    }

    private int hashtabHash2(String key){
        long hashCode = 0;
        for (int i = 0; i < key.length(); i++){
            hashCode += key.charAt(i);
        }
        return (int) (1 + (hashCode % (capacity - 1)));
    }

    public void hashtabInit(){
        bucket = new String[(int) capacity][2]; erased = new boolean[(int) capacity];
    }

    public void hashtabAdd(String key, String value){
        for (int i = 0; i < capacity; i++){
            var j = (int) ((hashtabHash(key) + i * hashtabHash2(key)) % capacity);

            if (bucket[j][0] == null || erased[j]){
                bucket[j][0] = key; bucket[j][1] = value;
                erased[j] = false;
                return;
            }
            if (bucket[j][0].equals(key)) {
                bucket[j][1] = value;
                return;
            }
        }
        resize();
        hashtabAdd(key, value);
    }

    public String hashtabLookup(String key){
        for (int i = 0; i < capacity; i++){
            var j = (int) ((hashtabHash(key) + i * hashtabHash2(key)) % capacity);

            if (bucket[j][0] == null && !erased[j]){
                break;
            }

            if (bucket[j][0] != null && bucket[j][0].equals(key) && !erased[j]){
                return bucket[j][1];
            }
        }
        return String.format("Value not found for key: %s", key);
    }

    public boolean hashtabDelete(String key){
        for (int i = 0; i < capacity; i++) {
            var j = (int) ((hashtabHash(key) + i * hashtabHash2(key)) % capacity);

            if (bucket[j][0] == null && !erased[j]){
                return false;
            }

            if (bucket[j][0].equals(key)){
                erased[j] = true;
                bucket[j][0] = null; bucket[j][1] = null;
                return true;
            }
        }
        return false;
    }

    private void resize(){
        var oldCapacity = (int) capacity;
        capacity *= 2;

        var oldBucket = bucket; var oldErased = erased;

        bucket = new String[(int) capacity][2]; erased = new boolean[(int) capacity];

        for (int i = 0; i < oldCapacity; i++){
            if (oldBucket[i][0] != null && !oldErased[i]){
                hashtabAdd(oldBucket[i][0], oldBucket[i][1]);
            }
        }
    }
}