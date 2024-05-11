package Java_AdvanceTraining_Day5_Wipro;

interface Loan {
    double calculateInterest();
}

class EducationalLoan implements Loan {
    @Override
    public double calculateInterest() {
        return 0.10;
    }
}

class HousingLoan implements Loan {
    @Override
    public double calculateInterest() {
        return 0.12;
    }
}

class BusinessLoan implements Loan {
    @Override
    public double calculateInterest() {
        return 0.15;
    }
}

class LoanFactory {
    public static Loan getLoan(String loanType) {
        switch (loanType.toLowerCase()) {
            case "educational":
                return new EducationalLoan();
            case "housing":
                return new HousingLoan();
            case "business":
                return new BusinessLoan();
            default:
                return null;
        }
    }
}

public class Bank_Loan {
    public static void main(String[] args) {
        String loanType = "business"; // You can change this to any type of loan
        Loan loan = LoanFactory.getLoan(loanType);
        if (loan != null) {
            double interestRate = loan.calculateInterest();
            System.out.println("The interest rate for " +
            loanType + " loan is " + (interestRate * 100) + "%");
        } else {
            System.out.println("Invalid loan type");
        }
    }
}