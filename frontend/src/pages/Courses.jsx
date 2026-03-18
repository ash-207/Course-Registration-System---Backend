import { useEffect, useState } from "react";
import API from "../api/api";

function Courses() {

  const [courses, setCourses] = useState([]);

  useEffect(() => {
    API.get("/courses")
      .then((res) => setCourses(res.data));
  }, []);

  return (
    <div>
      <h2>Available Courses</h2>

      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.courseName}</h3>
          <p>{course.instructor}</p>
          <button>Enroll</button>
        </div>
      ))}
    </div>
  );
}

export default Courses;