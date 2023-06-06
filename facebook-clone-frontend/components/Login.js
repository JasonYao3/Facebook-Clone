import Image from "next/image";
import { signIn } from "next-auth/react";
("next-auth/client");

const Login = () => {
  return (
    <div className="flex flex-col items-center my-auto mx-auto">
      <div>
        <Image
          src="https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg"
          height={240}
          width={240}
        />
      </div>
      <div>
        <a
          onClick={signIn}
          className="px-20 py-4 z-10 text-2xl cursor-pointer -mt-16 bg-blue-500 rounded-md text-white"
        >
          Login
        </a>
      </div>
    </div>
  );
};

export default Login;
