function navigationPage(pageID) {
  if (pageID.classList.contains("actionBlock")) {
    // Get the <span> element that closes the modal
    var closeActionBlocks = document.getElementsByClassName("closeActionBlock");

    // When the user clicks on <span> (x), close the modal
    for (let i = 0; i < closeActionBlocks.length; i++) {
      closeActionBlocks[i].onclick = function () {
        pageID.style.display = "none";
      };
    }

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
      if (event.target == pageID) {
        pageID.style.display = "none";
      }
    };

    // When the user clicks on the button, open the modal
    pageID.style.display = "block";
  } else {
    var currentPage = document.getElementsByClassName("currentPage");
    for (let i = 0; i < currentPage.length; i++) {
      currentPage[i].classList.add("hiddenPage");
      currentPage[i].classList.remove("currentPage");
    }
    pageID.classList.remove("hiddenPage");
    pageID.classList.add("currentPage");
  }
}

function actionError(pageID) {
  console.log(pageID);
  var modal = document.getElementsByClassName("modal");
  for (let i = 0; i < modal.length; i++) {
    modal[i].style.display = "none";
  }

  var currentPage = document.getElementsByClassName("currentPage");
  for (let i = 0; i < currentPage.length; i++) {
    currentPage[i].classList.add("hiddenPage");
    currentPage[i].classList.remove("currentPage");
    // currentPage[i].style.display = "none";
  }
  pageID.classList.remove("hiddenPage");
  pageID.classList.add("currentPage");
}

function actionSuccess(pageID) {
  console.log(pageID);
  var modal = document.getElementsByClassName("modal");
  for (let i = 0; i < modal.length; i++) {
    modal[i].style.display = "none";
  }
  var currentPage = document.getElementsByClassName("currentPage");
  for (let i = 0; i < currentPage.length; i++) {
    currentPage[i].classList.add("hiddenPage");
    currentPage[i].classList.remove("currentPage");
  }
  pageID.classList.remove("hiddenPage");
  pageID.classList.add("currentPage");
  // pageID.style.display = "block";
}
