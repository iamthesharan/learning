
const currentCalculationDescription = document.getElementById(
  "current-calculation"
);
const currentResultOutput = document.getElementById("current-result");

let userInput = document.getElementById("input-number");
const addBtn = document.getElementById("btn-add");
const subbtn = document.getElementById("btn-subtract");
const multiplyBtn = document.getElementById("btn-multiply");
const divideBtn = document.getElementById("btn-divide");

function outputResult(result, text) {
  currentResultOutput.innerText = result;
  currentCalculationDescription.innerText = text;
}


