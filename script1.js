window.onscroll = function() {stickyEffect()};

var navbar = document.getElementById("container");
var sticky = navbar.offsetTop;

function stickyEffect() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}

function newDoc1(){
	window.location.assign("Student1.html")
}
function newDoc2(){
	window.location.assign("Student2.html")
}
function newDoc3(){
	window.location.assign("Student3.html")
}
function newDoc4(){
	window.location.assign("Student4.html")
}


var slideIndex = 0;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex> slides.length) {slideIndex = 1} 
    slides[slideIndex-1].style.display = "block"; 
    setTimeout(showSlides, 5000); // Change image every 2 seconds
}
//Image location display//
var modal = document.getElementById('myModal');
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

document.getElementById("locationpic1").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15843.88061968673!2d79.8550363!3d6.8941733!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x3cb49d41e94dfeed!2sMajestic+City!5e0!3m2!1sen!2slk!4v1552804119299' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});

document.getElementById("locationpic2").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15843.297389062373!2d79.8514441!3d6.9115951!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x141db277b60011d8!2sLiberty+Plaza!5e0!3m2!1sen!2slk!4v1552803476812' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});

document.getElementById("locationpic3").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15843.093762058337!2d79.8553711!3d6.9176674!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x872e9262f485d782!2sColombo+City+Centre!5e0!3m2!1sen!2slk!4v1552885832276' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});

document.getElementById("locationpic4").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15843.671442780242!2d79.8529925!3d6.9004267!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x3b9f2109905dde6d!2sMarino+Mall!5e0!3m2!1sen!2slk!4v1552886140274' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});

document.getElementById("locationpic5").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3957.5477820989754!2d80.63475191477504!3d7.292179194736786!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae3662be0c2cc7f%3A0xfd9ffe3da66f497!2sKandy+City+Centre%2C+Sri+Dalada+Veediya%2C+Kandy+20000!5e0!3m2!1sen!2slk!4v1552886420864' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});

document.getElementById("locationpic6").addEventListener("click",()=>{
  modal.style.display = "block";
  document.getElementById("map").innerHTML = "<iframe src='https://www.google.com/maps/place/One+Galle+Face/@6.9275314,79.8450774,16z/data=!4m12!1m6!3m5!1s0x3ae2593ba7942097:0x74475a2cc5a135f1!2sOne+Galle+Face!8m2!3d6.9272545!4d79.8450774!3m4!1s0x3ae2593ba7942097:0x74475a2cc5a135f1!8m2!3d6.9272545!4d79.8450774' width='400' height='300' frameborder='0' style='border:0' allowfullscreen></iframe>";
});
// When the user clicks on div, open the popup
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}




