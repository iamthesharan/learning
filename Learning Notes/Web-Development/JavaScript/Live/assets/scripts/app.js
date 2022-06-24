const DEFAULT_VALUE = 0;
let currentResult = DEFAULT_VALUE;

const addNumbers = function addNumbers() {
  const enteredNumber = parseInt(userInput.value);
  const calculationDescription = `${currentResult} + ${enteredNumber}`;
  currentResult = currentResult + enteredNumber;
  outputResult(currentResult, calculationDescription);
};
addBtn.addEventListener("click", addNumbers);
