//Trig Solver Dynamically
public static int solver(List<List<Integer>> trig){
        for (int i = trig.size()-2; i >=0; i--){
            for (int j = 0; j < i+1; j ++){
                trig.get(i).set(j, Math.min(trig.get(i+1).get(j),trig.get(i+1).get(j+1))+trig.get(i).get(j));
            }
        }
        return trig.get(0).get(0);
    }