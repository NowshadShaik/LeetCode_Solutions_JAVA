package Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3606_Coupon_Code_Validator {

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> res = new ArrayList<>();

        List<String> elecList = new ArrayList<>();
        List<String> grocList = new ArrayList<>();
        List<String> pharList = new ArrayList<>();
        List<String> restList = new ArrayList<>();

        for(int i=0;i<code.length;i++) {
            String coupon = code[i];

            if(coupon.isBlank() || !isActive[i] || !isValidCoupon(coupon))
                continue;

            String business = businessLine[i];
            switch(business) {
                case "electronics":
                    elecList.add(coupon);
                    break;
                case "grocery":
                    grocList.add(coupon);
                    break;
                case "pharmacy":
                    pharList.add(coupon);
                    break;
                case "restaurant":
                    restList.add(coupon);
                    break;
                default:
                    continue;
            }
        }

        Collections.sort(elecList);
        Collections.sort(grocList);
        Collections.sort(pharList);
        Collections.sort(restList);
        res.addAll(elecList);
        res.addAll(grocList);
        res.addAll(pharList);
        res.addAll(restList);
        return res;
    }

    private boolean isValidCoupon(String coupon) {
        for(char c: coupon.toCharArray()) {

            if(!Character.isLetterOrDigit(c) && c != '_')
                return false;
        }

        return true;
    }
}
