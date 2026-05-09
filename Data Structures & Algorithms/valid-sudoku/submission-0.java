class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set= new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];

                if(ch=='.') continue;

                String row=i+"row"+ch;
                String col=j+"col"+ch;
                String box=(i/3)*3+(j/3)+"box"+ch;

                if(set.contains(row)||set.contains(col)||set.contains(box)) return false;

                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}
