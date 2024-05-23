package org.labExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class three {
    public static List<Double> findDetails(List<Double> s){

        Double avg = 0.0;
        for (int i = 0; i < s.size(); i++) {
            avg += s.get(i);
        }
        avg /= s.size();
        Double less = 0.0;
        Double more = 0.0;
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i) < avg){
                less++;
            }
            else if( s.get(i) > avg){
                more++;
            }
        }
        List<Double> ans = new ArrayList<>();
        ans.add(avg);
        ans.add(less);
        ans.add(more);

        return ans;
    }
    public static void main(String[] args) {

        List<Double> s = new ArrayList<Double>();
        s.add(23500.0);
        s.add(25080.0 );
        s.add(28760.0 );
        s.add(22340.0 );
        s.add(19890.0);

        System.out.println(findDetails(s));

    }
}
