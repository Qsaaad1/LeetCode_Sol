// 51. N-Queen Problem


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++)
            Arrays.fill(board[i],'.');
        
        List<List<String>> result = new ArrayList<>();
        backtrack(n,board,0,result); // Main Line ye hai 
        
        return result;
    }
    
     private void backtrack(int n, char[][] board, int row, List<List<String>> result) {
            if (row == n) {
                result.add(constructBoard(board));
                return;
            }

            for (int col = 0; col < n; col++) {
                if (canPlaceQueen(board, row, col)) {
                    board[row][col] = 'Q';
                    backtrack(n, board, row + 1, result);
                    board[row][col] = '.'; // backtrack
                }
            }
        }

        private boolean canPlaceQueen(char[][] board, int row, int col) {
            // column check
            for (int i = row - 1; i >= 0; i--)
                if (board[i][col] == 'Q')
                    return false;

            // diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 'Q')
                    return false;

            // anti-diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
                if (board[i][j] == 'Q')
                    return false;

            return true;
        }

        private List<String> constructBoard(char[][] board) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < board.length; i++)
                result.add(new String(board[i]));

            return result;
        }
    }