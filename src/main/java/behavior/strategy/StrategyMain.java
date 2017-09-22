package behavior.strategy;

import behavior.strategy.validation.ValidationStrategyEnum;
import behavior.strategy.validation.Validator;
import lombok.extern.slf4j.Slf4j;

import static behavior.strategy.validation.ValidationStrategyEnum.*;

@Slf4j
public class StrategyMain {

    public static void main(String[] args) {
        log.info("Strategy : ");
        for (ValidationStrategyEnum strategyEnum : ValidationStrategyEnum.values()) {
            log.info(strategyEnum.info());
        }
        log.info("\n");

        Validator v = new Validator(IS_ALL_LOWERCASE.strategy());
        log.info("CLASS isNumeric : " + v.validate("aaaa"));
        v = new Validator(IS_ALL_LOWERCASE.strategy());
        log.info("CLASS IsAllLowerCase : " + v.validate("bbbb"));
    }
}
