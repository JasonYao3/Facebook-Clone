import React from "react";
import { RiVideoAddFill } from "react-icons/ri";
import { BiSearch } from "react-icons/bi";
import { CgMoreAlt } from "react-icons/cg";
import Contacts from "./Contacts";

const RightSidebar = () => {
  return (
    <div className="  hidden md:inline-flex flex-col pt-4 max-w-xl md:min-w-[200px] lg:min-w-[250px]">
      <div className="flex items-center text-gray-500">
        <p className="flex text-lg font-semibold flex-grow">Contacts</p>
        <div className="flex space-x-1 px-2">
          <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
            <RiVideoAddFill />
          </div>
          <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
            <BiSearch />
          </div>
          <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
            <CgMoreAlt />
          </div>
        </div>
      </div>
      <Contacts
        src="https://images.pexels.com/photos/3845457/pexels-photo-3845457.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500"
        name="Jason Yao"
        status="Online"
      />
      <Contacts
        src="https://images.pexels.com/photos/16511744/pexels-photo-16511744.jpeg"
        name="John Yao"
        status="Online"
      />
      <Contacts
        src="https://images.pexels.com/photos/16552341/pexels-photo-16552341.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        name="Jacky Chan"
        status="Offline"
      />
      <Contacts
        src="https://images.pexels.com/photos/14768108/pexels-photo-14768108.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        name="James Ng"
        status="Offline"
      />
    </div>
  );
};

export default RightSidebar;
