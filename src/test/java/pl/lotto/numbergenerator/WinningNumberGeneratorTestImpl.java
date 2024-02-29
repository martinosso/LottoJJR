package pl.lotto.numbergenerator;

import java.util.Set;

public class WinningNumberGeneratorTestImpl implements WinningNumbersGenerable {
    private Set<Integer> generatedNumbers;

    public WinningNumberGeneratorTestImpl() {
        generatedNumbers = Set.of(1, 2, 3, 4, 5, 6);
    }

    WinningNumberGeneratorTestImpl(Set<Integer> generatedNumbers) {
        this.generatedNumbers = generatedNumbers;
    }

    @Override
    public Set<Integer> generateSixRandomNumbers() {
        return generatedNumbers;
    }
}
