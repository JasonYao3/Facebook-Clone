/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,
  images: {
    domains: [
      "upload.wikimedia.org",
      "scontent.fyto1-2.fna.fbcdn.net",
      "static.xx.fbcdn.net",
      "images.pexels.com",
    ],
  },
};

module.exports = nextConfig;
