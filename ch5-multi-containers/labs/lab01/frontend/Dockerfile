FROM node:latest
WORKDIR /app
ARG NEXT_PUBLIC_API_URL
ENV NEXT_PUBLIC_API_URL=$NEXT_PUBLIC_API_URL
COPY package.json ./
RUN npm install
COPY . /app
EXPOSE 3000
CMD [ "npm", "start" ]