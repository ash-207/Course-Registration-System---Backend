import { Link } from "react-router-dom";

function Dashboard() {

  return (
    <div>
      <h1>Dashboard</h1>

      <Link to="/courses">View Courses</Link>
      <br />
      <Link to="/mycourses">My Courses</Link>
    </div>
  );
}

export default Dashboard;