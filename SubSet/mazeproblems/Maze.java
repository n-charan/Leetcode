package SubSet.mazeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maze {
    public static void main(String[] args) {

        boolean [][] board= {{true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path=new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);


    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static String  path1(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return p;
        }
        if(r>1){
            path1(p+"D",r-1,c);
        }
        if(c>1){
            path1(p+"R",r,c-1);
        }
        return p;
    }
    static ArrayList<String>  path2(String p,int r, int c){
        if(r==1 && c==1){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(path2(p+"D",r-1,c));

        }
        if(c>1){
           list.addAll(path2(p+"R",r,c-1));

        }
        return list;

    }

    static ArrayList<String>  path3(String p,int r, int c){
        if(r==1 && c==1){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(path3(p+"V",r-1,c));

        }
        if(c>1){
            list.addAll(path3(p+"H",r,c-1));
        }
        if(r>1 && c >1){
            list.addAll(path3(p+"D",r-1,c-1));
        }
        return list;

    }
    static void  allPath(String p,boolean[] [] maze,int r, int c){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            allPath(p+"D",maze,r+1,c);
        }
        if(c<maze.length-1){
            allPath(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPath(p+"L",maze,r,c-1);
        }

        maze[r][c]=true;
        return ;
    }

    static void  allPathPrint(String p,boolean[] [] maze,int r, int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze.length-1){
            path[r][c]=step;
            for (int [] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allPathPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze.length-1){
            allPathPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathPrint(p+"L",maze,r,c-1,path,step+1);
        }

        path[r][c]=0;
        maze[r][c]=true;

        return ;
    }

}
