package bitcamp.java106.pms.controller;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;
import java.util.Scanner;

public class BoardController {
    public static Scanner keyScan;

    static Board[] boards = new Board[100]; 
    static int boardIndex = 0;

    public static void service(String menu, String option) {
        if (menu.equals("board/add")) {
            onBoardAdd();
        } else if (menu.equals("board/list")) {
            onBoardList();
        } else if (menu.equals("board/view")) {
            onBoardView(option);
        } else if (menu.equals("board/update")) {
            onBoardUpdate(option);
        } else if (menu.equals("board/delete")) {
            onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    static int getBoardIndex(String name) {
        for (int i = 0; i < boardIndex; i++) {
            
            if (boards[i] == null) continue;
            String boardNum = Integer.toString(boards[i].num);
            if (name.equals(boardNum)) {
                return i;
            }
        }
        return -1;
    }

    static void onBoardAdd() {
        
        System.out.println("[게시글 등록]");
        Board board = new Board();

        System.out.print("제목? ");
        board.title = keyScan.nextLine();
        System.out.print("내용? ");
        board.content = keyScan.nextLine();
        System.out.print("등록일? ");
        board.startDate = keyScan.nextLine();

        board.num = boardIndex;

        boards[boardIndex++] = board;
    }

    static void onBoardList() {
        System.out.println("[게시글 목록]");
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            System.out.printf("%s, %s, %s\n", boards[i].num, boards[i].title, boards[i].startDate);
        }
    }

    static void onBoardView(String name) {
        System.out.println("[게시글 조회]");

        if(name == null) {
            System.out.println("게시글 번호를 입력하시기 바랍니다.");
            return;
        }

        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 게시글이 없습니다.");
        } else {
            Board board = boards[i];
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.content);
            System.out.printf("등록일: %s\n", board.startDate);
        }
    }

    static void onBoardUpdate(String name) {
        System.out.println("[게시글 변경]");

        if(name == null) {
            System.out.println("게시글 번호를 입력하시기 바랍니다.");
            return;
        }

        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 게시글이 없습니다.");
        } else {
            Board board = boards[i];
            Board updateBoard = new Board();
            System.out.printf("제목(%s): ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s): ", board.content);
            updateBoard.content = keyScan.nextLine();
            updateBoard.num = board.num;
            updateBoard.startDate = board.startDate;
            boards[i] = updateBoard;
        }
    }

    static void onBoardDelete(String name) {
        System.out.println("[게시글 삭제]");

        if(name == null) {
            System.out.println("게시글 번호를 입력하시기 바랍니다.");
            return;
        }

        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 게시글이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
}