import "./App.css";
import StudentSignUpForm from "./Components/StudentSignUpFormComponent";
import MentorLoginForm from "./Components/MentorLoginFormComponent";
import AddCourseForm from "./Components/AddCourseFormComponent";
import MentorSignUpForm from "./Components/MentorSignUpFormComponent";
import Navbar from "./Components/NavbarComponent";
import Footer from "./Components/FooterComponent";
import AdminFunctions from "./Components/AdminFunctionsComponent";
import ListCourseComponent from "./Components/ListCourseComponent";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import SuccessfullRegistration from "./Components/SuccessfullRegistrationComponent";
import ListOfAllMentors from "./Components/ListOfAllMentorsComponent";
import HomePage from "./Components/HomePageComponent";
import MentorFunctions from "./Components/MentorFunctionsComponent";
import StudentFunctions from "./Components/StudentFunctionsComponent";
import SingleCourseDetailsCard from "./Components/SingleCourseDetailsCardComponent";
import ProfileInfo from "./Components/ProfileInfoComponent";
import AboutComponent from "./Components/AboutComponent";
import ContactsComponent from "./Components/ContactsComponent";
import FAQComponent from "./Components/FAQComponent";
import LoadingComponenet from "./Components/LoadingComponenet";
import StudentLoginForm from "./Components/StudentLoginFormComponent";
import AdminLoginForm from "./Components/AdminLoginFormComponent";
import GetCertificateComponent from "./Components/GetCertificateComponent";
import StudentUpdateForm from "./Components/StudentUpdateFormComponent";
import MentorUpdateForm from "./Components/MentorUpdateFormComponent";
import DeleteStudentAccountComponent from "./Components/DeleteStudentAccountComponent";
import DeleteMentorAccountComponent from "./Components/DeleteMentorAccountComponent";
<link
  rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
  integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
  crossorigin="anonymous"
/>
function App() {
  return (
    <div>
      <Router>
        <Navbar />
        <Switch>
          <Route exact path="/" component={HomePage} />
          <Route path="/allcourses" component={ListCourseComponent} />
          <Route path="/studentsignup" component={StudentSignUpForm} />
          <Route path="/mentorsignup" component={MentorSignUpForm} />
          <Route path="/addcourse" component={AddCourseForm} />
          <Route path="/adminfunctions" component={AdminFunctions} />
          <Route path="/successfullreg" component={SuccessfullRegistration} />
          <Route path="/listofallmentors" component={ListOfAllMentors} />
          <Route path="/mentorfunctions" component={MentorFunctions} />
          <Route path="/studentfunctions" component={StudentFunctions} />
          <Route path="/coursedetailcard" component={SingleCourseDetailsCard} />
          <Route path="/profileinfo" component={ProfileInfo} />
          <Route path="/about" component={AboutComponent} />
          <Route path="/contact" component={ContactsComponent} />
          <Route path="/faq" component={FAQComponent} />
          <Route path="/loading" component={LoadingComponenet} />
          <Route path="/mentorlogin" component={MentorLoginForm} />
          <Route path="/studentlogin" component={StudentLoginForm} />
          <Route path="/adminlogin" component={AdminLoginForm} />
          <Route path="/getcertificate" component={GetCertificateComponent}/>
          <Route path="/studentupdate" component={StudentUpdateForm}/>
          <Route path="/mentorupdate" component={MentorUpdateForm}/>
          <Route path="/deletestudent" component={DeleteStudentAccountComponent}/>
          <Route path="/deletementor" component={DeleteMentorAccountComponent}/>
          <HomePage />
        </Switch>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
