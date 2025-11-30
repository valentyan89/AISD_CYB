public class PhoneNumber {
    private StringBuilder phoneNumber = new StringBuilder();

    public PhoneNumber(String oldNumber){
        if (oldNumber.charAt(0) == '8'){
            this.phoneNumber.append('+'); this.phoneNumber.append(oldNumber); this.phoneNumber.setCharAt(1, '7'); this.phoneNumber.insert(5,'-'); this.phoneNumber.insert(9,'-');
        }
        else{
            this.phoneNumber.append(oldNumber.substring(0, oldNumber.length() - 10 + 3)); this.phoneNumber.append('-').append(oldNumber.substring(oldNumber.length() - 10 + 3)); this.phoneNumber.insert(this.phoneNumber.length() - 4, '-');
        }
    }
    @Override
    public String toString(){
        return phoneNumber.toString();
    }
}
