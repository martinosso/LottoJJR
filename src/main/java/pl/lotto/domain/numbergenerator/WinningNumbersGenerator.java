package pl.lotto.domain.numbergenerator;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class WinningNumbersGenerator implements WinningNumbersGenerable{
    private final int LOWER_BAND = 1;
    private final int UPPER_BAND = 99;
    private final OneRandomNumberFetcher client;
    @Override
    public SixRandomNumbersDto generateSixRandomNumbers(int lowerBand, int upperBand, int count) {
        Set<Integer> randomNumbers = new HashSet<>();
        while(isAmountOfNumbersLowerThanSix(randomNumbers)){
            OneRandomNumberResponseDto randomNumberResponseDto = client.retrieveOneRandomNumber(LOWER_BAND, UPPER_BAND);
            int randomNumber = randomNumberResponseDto.number();
            randomNumbers.add(randomNumber);
        }
        return SixRandomNumbersDto.builder().numbers(randomNumbers).build();
    }

    private boolean isAmountOfNumbersLowerThanSix(Set<Integer> randomNumbers) {
        return randomNumbers.size() < 6;
    }
}
