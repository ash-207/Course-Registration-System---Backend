import API from "../api/api";

export const login = async (data) => {
  const res = await API.post("/auth/login", data);

  localStorage.setItem("token", res.data.token);

  return res.data;
};