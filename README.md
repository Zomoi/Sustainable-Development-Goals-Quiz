<p align="center" dir="auto">
  <img src="https://github.com/Zomoi/Final-Proj-in-OOP/blob/33f0d5ec3c96293fab262293d4aae986d9cb0cb1/output-onlinepngtools.png" width="100">
</p>

<h1 align="center" tabindex="-1" class="heading element" dir="auto">Sustainable Development Goals Quiz</h1>
<p align="center" dir="auto">
  <em>
    <code>📓A Java Quiz Application Test📓</code>
  </em>
</p>
<p align="center" dir="auto">
  <b>IT-2104</b>
  <br>
  <a href="https://github.com/Zomoi">
    Rico, B-jork M.
  </a>
</p>
<hr></hr>

<h2>🔍About</h2>
<ul dir="auto">
  <li><a href="#-project-overview">Project Overview</a></li>
  <li><a href="#-OOP-principles">OOP Principles</a></li>
  <li><a href="#-SDG">Chosen SDG</a></li>
  <li><a href="#-instructions">Instructions on Running the Program</a></li>
  <li><a href="#-acknowledgment">Acknowledgments</a></li>
</ul>
<hr></hr>

<div class="markdown-heading" dir="auto">
  <h2 tabindex="-1" class="heading-element" dir="auto">📖Project Overview</h2>
</div>
<p dir="auto">
  This Java console-based quiz application tests users' knowledge on the United Nations Sustainable Development Goals (SDGs) through multiple-choice questions. This quiz application aims to promote awareness and understanding of the SDGs through an interactive, multiple-choice question format. The quiz is structured to provide users with a fun and educational way to test their knowledge on global sustainability issues. Upon completion, the user is given a score that reflects their knowledge and understanding of these critical topics.
</p>
<hr></hr>

<div class="markdown-heading" dir="auto">
  <h2 tabindex="-1" class="heading-element" dir="auto">☕OOP Principles</h2>
</div>
<ul dir="auto">
  <li><b>💊Encapsulation</b> - In the BaseQuestions class, the questions, options, and answers arrays are marked as protected. This encapsulates the question-related data, allowing controlled access to them through getter methods in the Questions class (getQuestions(), getOptions(), and getAnswers()).</li>
  <li><b>🧬Inheritance</b> - The Questions class inherits from the BaseQuestions class. This allows Questions to access the protected variables and methods in the BaseQuestions class without directly exposing them. Which BaseQuestions acts a base class providing the common properties (questions, options, answers) to its subclass Questions.</li>
  <li><b>🗄️Abstraction</b> - The Timer in the Quiz class provides an example of abstraction where the timer's behavior is customized using an anonymous ActionListener. You don’t need to understand the low-level implementation of how the timer works, just the higher-level action it performs when triggered (e.g., updating the time display and stopping the timer when time runs out). Methods like nextQuestion(), displayAnswer(), and results() abstract away the details of how the quiz operates. These methods handle specific parts of the quiz functionality, allowing the main program to remain clean and simple. </li>
  <li><b>📑Polymorphism</b> - The Quiz class uses method overriding through the implements ActionListener interface. The method actionPerformed() is overridden to handle button clicks for the quiz. This is an example of polymorphism, as the behavior of the method changes based on the button clicked (buttonA, buttonB, or buttonC). In the case of the Timer, polymorphism is also used where the actionPerformed() method is invoked on the timer's own action listener, allowing custom behavior once the timer reaches zero.</li>
</ul>
<hr></hr>

<div class="markdown-heading" dir="auto">
  <h2 tabindex="-1" class="heading-element" dir="auto">🌏Chosen SDG</h2>
</div>
<p dir="auto">
  <h3>📖SDG 4 : Quality Education</h3>
  <br>
  
![sdg4](https://github.com/user-attachments/assets/a7e32e0f-c9e2-442e-9fd6-e4781cc4ee5d)
 
  <br>
  SDG 4 aims to ensure inclusive and equitable quality education for all, promoting lifelong learning opportunities. This project aligns with the goal of spreading awareness about SDGs by engaging users in a quiz format, helping them learn about SDGs in an interactive manner.
</p>
<hr></hr>

<div class="markdown-heading" dir="auto">
  <h2 tabindex="-1" class="heading-element" dir="auto">⚙️Instructions on Running the Program</h2>
</div>
<ol dir="auto">
  <li><b>Step 1:</b> Clone or Download the Project</li>
  <pre>
    <code>git clone https://github.com/Zomoi/Sustainable-Development-Goals-Quiz.git</code>
  </pre>
  <p>OR Download the project files as a ZIP and extract them to your preferred folder.</p>
  
  <li><b>Step 2:</b> Open your IDE</li>
  <p>Ensure that your IDE supports Java development.</p>
  
  <li><b>Step 3:</b> Compile the Program</li>
  <p>After adding the project files, compile the Java files using your IDE or the terminal.</p>
  
  <li><b>Step 4:</b> Run the Program</li>
  <p>Execute the main Java file to start the quiz.</p>
  
  <li><b>Step 5:</b> Play the Quiz</li>
  <p>Answer the multiple-choice questions, and check your score at the end of the quiz.</p>
  
  <li><b>Step 6:</b> View Results</li>
  <p>After completing the quiz, the program will display the final score based on the number of correct answers.</p>
</ol>
<hr></hr>

<div class="markdown-heading" dir="auto">
  <h2 tabindex="-1" class="heading-element" dir="auto">💮Acknowledgment💮</h2>
</div>
<ul>
  <li>Professor Jayson, for continuous support and guidance during the course.</li>
  <li>To my dogs, Ulap, Tala, Ulan, Niyebe, and Sinag.</li>
  <li>To a lot of tutorials in YouTube to fill the knowledge gap.</li>
</ul>
<hr></hr>
<h1>UNO QT! 🚀⭐</h1>

![maloi](https://github.com/user-attachments/assets/7c20d3d1-a445-4daa-b9b6-9b18f03539f1)

