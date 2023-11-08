package lotto.winningLotto.service;

import static camp.nextstep.edu.missionutils.Console.readLine;

import lotto.StringCalculator;
import lotto.winningLotto.domain.LottoNumber;

public class LottoNumberService {

    public LottoNumber createLottoNumber() {
        while (true) {
            try {
                return new LottoNumber(StringCalculator.withOutSpaceBarAndSplitAndPositives(readLine()));
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 당첨 번호를 다시 입력해 주세요.");
            } catch (NullPointerException e) {
                System.out.println("[ERROR] 당첨 번호를 다시 입력해 주세요.");
            }
        }
    }
}
