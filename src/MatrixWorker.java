class MatrixWorker {

    int[][] getMatrixFromString (String s){

        String lines[] = s.split(System.getProperty("line.separator"));

        int[][] resMatr = new int[lines.length][lines.length];

        int count =0;

        String elements[] = new String[lines.length];

        for (int i=0; i<lines.length;i++){

            elements = lines[i].split(" ");

            for (int j=0;j<elements.length;j++){
                resMatr[i][j] = Integer.parseInt(elements[j]);
            }
        }
        return resMatr;
    }

}