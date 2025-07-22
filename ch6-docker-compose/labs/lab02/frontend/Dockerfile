# 1단계: 빌드
FROM node:20 AS builder

WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# 2단계: 실행
FROM node:20-alpine

WORKDIR /app
COPY --from=builder /app ./
EXPOSE 3000

ENV NODE_ENV=production

CMD ["npm", "start"]
