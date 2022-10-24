package lec08.jth.world;

import lec08.jth.world.machine.SetInfo;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {

        SetInfo setInfo = new SetInfo();
        setInfo.setCompanyInfo();

        Scanner scanner = new Scanner(System.in);

        boolean isLoopContinue = true;
        while (isLoopContinue) {

            System.out.println("회사명은?");
            String scanNext = scanner.next();

            String lowerScanNext = scanNext.toLowerCase();
            System.out.println(lowerScanNext);

            whatCompanyChoose(lowerScanNext, setInfo, scanner);
            System.out.println("종료하시겠습니까? 종료면 1을 아니면 아무 숫자나 입력하세요.");
            int result = scanner.nextInt();
            if (result == 1) {
                isLoopContinue = false;
                System.out.println("종료되었습니다.");
            }
        }
    }

    public static void whatCompanyChoose(String lowerScanNext, SetInfo setInfo, Scanner scanner) {

        int kindCompany         = 0;     // 회사 종류
        int resultKindInfo      = 0;     // 선택한 정보 종류

        if (lowerScanNext.contains("한화솔")) {
            System.out.println("한화솔루션케미칼 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 1;
        } else if (lowerScanNext.contains("lg화")) {
            System.out.println("엘지화학 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 2;
        } else if (lowerScanNext.contains("롯데케")) {
            System.out.println("롯데케미칼 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 3;
        } else if (lowerScanNext.contains("lg전")) {
            System.out.println("엘지전자 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 4;
        } else if (lowerScanNext.contains("삼성전")) {
            System.out.println("삼성전자 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 5;
        } else if (lowerScanNext.contains("sk하")) {
            System.out.println("에스케이하이닉스 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 6;
        }

        showCompanyInfo(kindCompany, resultKindInfo, setInfo);
    }
    
    public static int askWhatTypeAnswerWant(Scanner scanner, SetInfo setInfo) {
        System.out.println("어떤 정보를 원하세요?");
        System.out.println("1번 회사명");
        System.out.println("2번 회사주력사업");
        System.out.println("3번 회사위치");
        System.out.println("4번 총 인원");
        System.out.println("5번 매출액");
        System.out.println("6번 자산액");
        System.out.println("7번 부채액");
        System.out.println("8번 자본액");

        String chooseAnswerType = scanner.next();
        chooseAnswerType = chooseAnswerType.trim();

        int chsaType = 0;

        try {
            chsaType = Integer.parseInt(chooseAnswerType);
        } catch (Exception e) {
            System.out.println("잘못된 동작으로 프로그램을 종료합니다.");
            System.out.println("숫자만 입력하셔야 합니다.");
        }

        return chsaType;
    }

    public static void showCompanyInfo(int kindCompany, int resultKindInfo, SetInfo setInfo) {
        switch (kindCompany) {
            case 1 :
                System.out.println("한화솔루션케미칼입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.hcc.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.hcc.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.hcc.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.hcc.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.hcc.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.hcc.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.hcc.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.hcc.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }

                break;
            case 2 :
                System.out.println("LG화학입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lgChem.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lgChem.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lgChem.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lgChem.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.lgChem.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.lgChem.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.lgChem.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.lgChem.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }
                break;
            case 3 :
                System.out.println("롯데케미칼입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lotteChemical.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lotteChemical.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lotteChemical.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lotteChemical.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.lotteChemical.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.lotteChemical.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.lotteChemical.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.lotteChemical.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }
                break;
            case 4 :
                System.out.println("LG전자입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lgElectronics.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lgElectronics.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lgElectronics.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lgElectronics.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.lgElectronics.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.lgElectronics.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.lgElectronics.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.lgElectronics.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }
                break;
            case 5 :
                System.out.println("삼성전자입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.samElec.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.samElec.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.samElec.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.samElec.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.samElec.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.samElec.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.samElec.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.samElec.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }
                break;
            case 6 :
                System.out.println("SK하이닉스입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.skhynix.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.skhynix.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.skhynix.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.skhynix.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmount = setInfo.skhynix.getSalesAmount();
                        System.out.println("회사 매출액 : " + intSalesAmount);
                        break;
                    case 6 :
                        int intPropertyAmount = setInfo.skhynix.getPropertyAmount();
                        System.out.println("회사 자산액 : " + intPropertyAmount);
                        break;
                    case 7 :
                        int intDebtAmount = setInfo.skhynix.getDebtAmount();
                        System.out.println("회사 부채액 : " + intDebtAmount);
                        break;
                    case 8 :
                        int intCapitalAmount = setInfo.skhynix.getCapitalAmount();
                        System.out.println("회사 자본액 : " + intCapitalAmount);
                        break;
                }
                break;
            default:
                System.out.println("올바른 값을 선택하세요.");
                break;
        }
    }

}
