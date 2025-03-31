package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public void memberAllPrint(List<MemberDTO> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("회원 목록이 없습니다.");
            return;
        }

        System.out.println("======= 회원 목록 =======");
        for (MemberDTO member : list) {
            // System.out.println("NUMBER : " + member.getNo());
            // System.out.println("ID : " + member.getId());
            // System.out.println("NAME : " + member.getName());
            // System.out.println("ADDR : " + member.getAddr());
            // System.out.println("EMAIL : " + member.getEmail());
            // System.out.println("AGE : " + member.getAge());
            // System.out.println("=========================");
            memberPrint(member);
        }

    }

    // 조회
    public String memberGetInfo(Scanner sc) {
        System.out.println("======= 회원 조회 =======");
        // 조회할 회원 아이디 리턴
        System.out.println("1. 아이디 조회");
        System.out.println("2. 이름 조회");
        System.out.print("번호 >> ");

        int no = Integer.parseInt(sc.nextLine());
        String input = "";

        if (no == 1) {
            System.out.print("조회할 아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.print("조회할 이름 >> ");
            input = sc.nextLine();
        }

        return input;
    }

    // dto 출력 메소드
    public void memberPrint(MemberDTO dto) {
        if (dto == null) {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        // dto 출력
        System.out.println("========= 회원 정보 =========");
        System.out.println("NUMBER : " + dto.getNo());
        System.out.println("ID : " + dto.getId());
        System.out.println("NAME : " + dto.getName());
        System.out.println("ADDR : " + dto.getAddr());
        System.out.println("EMAIL : " + dto.getEmail());
        System.out.println("AGE : " + dto.getAge());
        System.out.println("=============================");
    }

    // 삭제작업
    public String memberDeleteInfo(Scanner sc) {
        System.out.println("======= 회원 삭제 ========");

        // 삭제할 회원 아이디 입력
        System.out.print("삭제할 회원 아이디 >> ");
        // 입력받은 아이디 리턴
        String id = sc.nextLine();
        return id;
    }

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======= 회원정보 입력화면 =======");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? "입력 성공" : "입력 실패");
    }

    // 삭제시 출력 메소드
    public void printDeleteSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
    }

    // 업데이트 성공시 출력 메소드
    public void printUpdateSuccessMessage(int result, String id) {
        // result 값에 따라 수정 성공/ 수정 실패 출력
        System.out.println(result > 0 ? id + " 님의 정보를 수정하였습니다." : id + " 님의 정보를 수정에 실패 하였습니다.");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("======== 회원 정보 수정 ========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("================================");
        System.out.print("번호 >> ");

        int no = Integer.parseInt(sc.nextLine());
        MemberDTO upMemberDTO = null;

        if (no == 1) {
            // no == 1 memberUpdateAddr() 호출
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            // no == 2 memberUpdateEmail() 호출
            return memberUpdateEmail(sc);
        }

        // 리턴받은 DTO를 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id, 변경할 addr) => DTO에 담은 후 리턴
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("ID 입력 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());

        System.out.print("변경할 주소 입력 >> ");
        memberDTO.setAddr(sc.nextLine());

        System.out.println("주소가 변경되었습니다.");
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력(id, 변경할 email) => DTO에 담은 후 리턴
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("ID 입력 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());

        System.out.print("변경할 주소 입력 >> ");
        memberDTO.setEmail(sc.nextLine());

        System.out.println("이메일이 변경되었습니다.");
        return memberDTO;

    }
}
